package com.project.tienda.spring.controller;

import com.project.tienda.spring.dao.ProductRepository;
import com.project.tienda.spring.exception.ProductNotFoundException;
import com.project.tienda.spring.model.ProductEntity;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/productos")
public class ProductRestController {
    ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable Long id) {

        //pedido invalido
        if (id < 0) {
            return ResponseEntity.badRequest().build();
        }

        ProductEntity product = this.getProductRepository().findById(id).stream().filter(per -> id == per.getId()).
                findFirst().orElseThrow(() -> new ProductNotFoundException("no existe el producto"));

        return ResponseEntity.ok(product);
    }

    private ProductRepository getProductRepository(){
        return this.productRepository;
    }

    @GetMapping
    public ResponseEntity<?> listProducts() {
        return ResponseEntity.ok(this.getProductRepository().findAll(Sort.by(Sort.Direction.DESC)));
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@Validated @RequestBody ProductEntity product) {
        this.getProductRepository().save(product);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(product.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PutMapping
    public ResponseEntity<?> updateProduct(@RequestBody ProductEntity product) {

        return this.getProductRepository().findById(product.getId()).stream().filter(per -> per.getId() == product.getId()).
                findFirst().map(per -> {
                    per.setName(product.getName());
                    //TODO mas atributos
                    return ResponseEntity.ok(per);
                }).orElseThrow(() -> new ProductNotFoundException("No se encontro la persona"));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {

        return this.getProductRepository().findById(id).stream().filter(persona -> id == persona.getId()).
                findFirst().map(persona -> {
                            this.getProductRepository().delete(persona);
                            return ResponseEntity.noContent().build();
                        }
                ).orElseThrow(() -> new ProductNotFoundException("no existe la persona"));

    }
}

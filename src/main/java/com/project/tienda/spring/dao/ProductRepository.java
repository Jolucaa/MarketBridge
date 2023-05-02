package com.project.tienda.spring.dao;

import com.project.tienda.spring.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends ListPagingAndSortingRepository<ProductEntity,Long>, CrudRepository<ProductEntity,Long> {

}
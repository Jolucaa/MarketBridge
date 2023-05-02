package com.project.tienda.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
    @GetMapping("/index")
    public ResponseEntity<?> showIndex(){
        ModelAndView modelAndView = new ModelAndView("index");
        return ResponseEntity.ok().body(modelAndView);
    }
}

package com.educandoweb.course.controllers;

import com.educandoweb.course.entites.Category;
import com.educandoweb.course.entites.Product;
import com.educandoweb.course.services.CategoryService;
import com.educandoweb.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>>ListAll(){
        List<Product> list = service.listAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> listById(@PathVariable Long id){
        Product product = service.listById(id);
        return ResponseEntity.ok().body(product);
    }
}

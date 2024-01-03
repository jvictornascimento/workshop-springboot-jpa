package com.educandoweb.course.controllers;

import com.educandoweb.course.entites.Category;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")

public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>>ListAll(){
        List<Category> list = service.listAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Category> listById(@PathVariable Long id){
        Category category = service.listById(id);
        return ResponseEntity.ok().body(category);
    }
}

package com.educandoweb.course.services;

import com.educandoweb.course.entites.Category;
import com.educandoweb.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> listAll(){
        return repository.findAll();
    }

    public Category listById(Long id){
        Optional<Category> cat = repository.findById(id);
        return cat.get();
    }
}

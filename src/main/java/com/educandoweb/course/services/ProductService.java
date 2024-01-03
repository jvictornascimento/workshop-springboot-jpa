package com.educandoweb.course.services;

import com.educandoweb.course.entites.Product;
import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> listAll(){
        return repository.findAll();
    }

    public Product listById(Long id){
        Optional<Product> product = repository.findById(id);
        return product.get();
    }
}

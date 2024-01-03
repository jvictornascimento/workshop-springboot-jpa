package com.educandoweb.course.services;

import com.educandoweb.course.entites.Order;
import com.educandoweb.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> listAll(){
        return repository.findAll();
    }

    public Order listById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

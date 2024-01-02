package com.educandoweb.course.services;

import com.educandoweb.course.entites.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.LongFunction;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> listAll(){
        return repository.findAll();
    }

    public User findById (Long id){
       Optional<User> obj = repository.findById(id);
       return obj.get();
    }

}

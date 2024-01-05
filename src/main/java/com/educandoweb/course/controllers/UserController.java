package com.educandoweb.course.controllers;

import com.educandoweb.course.entites.User;
import com.educandoweb.course.services.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")

public class UserController {
    @Autowired
    private UserService service;
    @GetMapping //http 202
    public ResponseEntity<List<User>> listAll(){
        List<User> list = service.listAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}") //http 202
    public ResponseEntity<User> listById(@PathVariable Long id){
        User user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping //http 201
    @Transactional
    public ResponseEntity<User> insert(@RequestBody  User user){
        user = service.insert(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
    }
    @DeleteMapping("/{id}") //http 204
    public ResponseEntity<Void> delete (@PathVariable  Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<User> update (@PathVariable Long id, @RequestBody User obj){
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }


}

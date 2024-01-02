package com.educandoweb.course.repositories;


import com.educandoweb.course.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

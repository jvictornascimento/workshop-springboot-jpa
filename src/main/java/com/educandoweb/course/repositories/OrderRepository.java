package com.educandoweb.course.repositories;

import com.educandoweb.course.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

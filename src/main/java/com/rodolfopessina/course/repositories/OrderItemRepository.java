package com.rodolfopessina.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolfopessina.course.entities.OrderItem;
import com.rodolfopessina.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

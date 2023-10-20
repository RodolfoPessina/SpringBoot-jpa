package com.rodolfopessina.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodolfopessina.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

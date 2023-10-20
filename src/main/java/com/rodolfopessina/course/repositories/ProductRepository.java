package com.rodolfopessina.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolfopessina.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}

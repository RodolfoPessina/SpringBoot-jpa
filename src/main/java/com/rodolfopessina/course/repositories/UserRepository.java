package com.rodolfopessina.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolfopessina.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

package com.alansa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

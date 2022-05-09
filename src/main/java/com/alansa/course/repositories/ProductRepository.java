package com.alansa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

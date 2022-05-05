package com.alansa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

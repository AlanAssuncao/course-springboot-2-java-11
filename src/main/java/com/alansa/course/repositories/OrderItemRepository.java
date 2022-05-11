package com.alansa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

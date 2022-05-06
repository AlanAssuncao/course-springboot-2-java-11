package com.alansa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

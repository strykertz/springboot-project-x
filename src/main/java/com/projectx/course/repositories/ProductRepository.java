package com.projectx.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

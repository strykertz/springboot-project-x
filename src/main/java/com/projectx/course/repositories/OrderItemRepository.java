package com.projectx.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

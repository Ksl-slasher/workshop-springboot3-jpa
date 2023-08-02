package com.LeonardoKoslowski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LeonardoKoslowski.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}

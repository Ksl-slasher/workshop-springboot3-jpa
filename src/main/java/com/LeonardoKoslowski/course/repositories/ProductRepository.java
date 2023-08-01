package com.LeonardoKoslowski.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LeonardoKoslowski.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

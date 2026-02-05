package com.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entities.Category;
import com.project.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

package com.bazzarworld.ecommerce.dao;

import com.bazzarworld.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

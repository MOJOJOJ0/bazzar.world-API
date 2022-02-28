package com.bazzarworld.ecommerce.repo;

import com.bazzarworld.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

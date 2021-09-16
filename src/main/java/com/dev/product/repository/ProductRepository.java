package com.dev.product.repository;

import com.dev.product.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
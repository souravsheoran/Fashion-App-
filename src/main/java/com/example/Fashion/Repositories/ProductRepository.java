package com.example.Fashion.Repositories;

import com.example.Fashion.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

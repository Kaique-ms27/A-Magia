package com.example.magia.repository;

import com.example.magia.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, String>{

}

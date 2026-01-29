package com.example.magia.repository;

import com.example.magia.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<ProductCategory, Long > {
}

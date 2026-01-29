package com.example.magia.controller;

import com.example.magia.model.ProductCategory;
import com.example.magia.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @PostMapping
    public ProductCategory saveCategory(@RequestBody ProductCategory category) {
        categoryRepository.save(category);

        return category;
    }
}

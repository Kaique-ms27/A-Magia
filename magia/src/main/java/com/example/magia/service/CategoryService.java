package com.example.magia.service;

import com.example.magia.dto.response.CategoryDtoResponse;
import com.example.magia.dto.resquest.CategoryDtoRequest;
import com.example.magia.model.ProductCategory;
import com.example.magia.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService (CategoryRepository repository) {
        this.repository = repository;
    }

    public CategoryDtoResponse saveCategory (CategoryDtoRequest request) {

        ProductCategory category = new ProductCategory();
        category.setCategoryName(request.getCategoryName());

        repository.save(category);

        return new CategoryDtoResponse(category);
    }
}

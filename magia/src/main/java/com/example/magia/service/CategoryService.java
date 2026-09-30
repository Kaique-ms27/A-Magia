package com.example.magia.service;

import com.example.magia.dto.response.CategoryDtoResponse;
import com.example.magia.dto.response.ProductDtoResponse;
import com.example.magia.dto.resquest.CategoryDtoRequest;
import com.example.magia.model.Category;
import com.example.magia.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    // Constructor
    public CategoryService (CategoryRepository repository) {
        this.repository = repository;
    }


    // Create
    public CategoryDtoResponse saveCategory (CategoryDtoRequest request) {

        Category category = new Category();
        category.setCategoryName(request.getCategoryName());

        repository.save(category);

        return new CategoryDtoResponse(category);
    }

    // Read
    public List<CategoryDtoResponse> findAll() {
        List<Category> categoryList = repository.findAll();
        return CategoryDtoResponse.toList(categoryList);
    }

    // Delete
    public List<CategoryDtoResponse> deleteCategory(Long id) {
        Category category = repository.findById(id)
                .orElseThrow( () -> new RuntimeException("Categoria não encontrada"));

        repository.delete(category);

        List<Category> updatedCategory = repository.findAll();

        return CategoryDtoResponse.toList(updatedCategory);
    }

    public CategoryDtoResponse updatedCategory(long id, CategoryDtoRequest request) {
        Category updatedCategory = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));

        updatedCategory.setCategoryName(request.getCategoryName());
        repository.save(updatedCategory);

        return new CategoryDtoResponse(updatedCategory);
    }
}

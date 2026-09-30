package com.example.magia.controller;


import com.example.magia.dto.response.CategoryDtoResponse;
import com.example.magia.dto.response.ProductDtoResponse;
import com.example.magia.dto.resquest.CategoryDtoRequest;
import com.example.magia.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    //Create
    @PostMapping
    public CategoryDtoResponse saveCategory(@RequestBody CategoryDtoRequest request) {
        return service.saveCategory(request);
    }

    // Read
    @GetMapping
    public ResponseEntity<List<CategoryDtoResponse>> listCategory() {
        return ResponseEntity.ok(service.findAll());
    }


    //Update
    @PatchMapping("/{id}")
    public CategoryDtoResponse updateCategory(@PathVariable long id, @RequestBody CategoryDtoRequest request) {
        return service.updatedCategory(id, request);
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<List<CategoryDtoResponse>> deleteCategory(@PathVariable Long id) {
        ResponseEntity.ok("Excluído com Sucesso");
        return ResponseEntity.ok(service.deleteCategory(id));
    }
}

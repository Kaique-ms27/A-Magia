package com.example.magia.controller;


import com.example.magia.dto.response.CategoryDtoResponse;
import com.example.magia.dto.resquest.CategoryDtoRequest;
import com.example.magia.service.CategoryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @PostMapping
    public CategoryDtoResponse saveCategory(@RequestBody CategoryDtoRequest request) {
        return service.saveCategory(request);
    }
}

package com.example.magia.dto.response;

import com.example.magia.model.Category;
import lombok.Getter;

@Getter
public class CategoryDtoResponse {

    private Long categoryId;
    private String categoryName;

    public CategoryDtoResponse(Category category) {
        this.categoryId = category.getCategoryId();
        this.categoryName = category.getCategoryName();
    }
}

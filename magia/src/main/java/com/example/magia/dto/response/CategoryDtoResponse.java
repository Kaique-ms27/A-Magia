package com.example.magia.dto.response;

import com.example.magia.model.ProductCategory;
import lombok.Getter;

@Getter
public class CategoryDtoResponse {

    private Long categoryId;
    private String categoryName;

    public CategoryDtoResponse(ProductCategory category) {
        this.categoryId = category.getCategoryId();
        this.categoryName = category.getCategoryName();
    }
}

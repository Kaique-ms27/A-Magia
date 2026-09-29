package com.example.magia.dto.response;

import com.example.magia.model.Category;
import lombok.Getter;

import java.util.List;

@Getter
public class CategoryDtoResponse {

    private Long categoryId;
    private String categoryName;

    public CategoryDtoResponse(Category category) {
        this.categoryId = category.getCategoryId();
        this.categoryName = category.getCategoryName();
    }

    public static List<CategoryDtoResponse> toList(List<Category> categories) {
        return categories.stream()
                .map(CategoryDtoResponse::new)
                .toList();
    }
}

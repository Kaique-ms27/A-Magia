package com.example.magia.dto.response;

import com.example.magia.model.Product;
import lombok.Getter;

import java.util.List;

@Getter
public class ProductDtoResponse {
    private String productId;
    private String productName;
    private String productDescription;
    private Long category;
    private int currentQuantity;
    private int minimumQuantity;
    private boolean productStatus;

    public ProductDtoResponse(Product model) {
        this.productId = model.getProductId();
        this.productName = model.getProductName();
        this.productDescription = model.getProductDescription();
        this.currentQuantity = model.getCurrentQuantity();
        this.minimumQuantity = model.getMinimumQuantity();
        this.productStatus = model.isProductStatus();

        this.category = model.getCategory().getCategoryId();
    }

    public static List<ProductDtoResponse> toList(List<Product> products) {
        return products.stream()
                .map(ProductDtoResponse::new)
                .toList();
    }

}

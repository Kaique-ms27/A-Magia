package com.example.magia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Product")
@Getter
@Setter
public class Product {

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @JoinColumn(name = "product_category")
    private ProductCategory productCategory;

    @Column (name = "current_quantity")
    private int currentQuantity;

    @Column (name = "minimum_quantity")
    private int minimumQuantity;

    @Column (name = "product_status")
    private boolean productStatus;

    public Product () {}

    public Product(String productId, String productName,
                   String productDescription, ProductCategory productCategory,
                   int currentQuantity, int minimumQuantity,
                   boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        this.currentQuantity = currentQuantity;
        this.minimumQuantity = minimumQuantity;
        this.productStatus = productStatus;
    }
}

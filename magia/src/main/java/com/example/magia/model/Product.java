package com.example.magia.model;

import com.example.magia.dto.resquest.ProductDtoRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @ManyToOne
    @JoinColumn(name = "product_category")
    private Category category;

    @Column (name = "current_quantity")
    private int currentQuantity;

    @Column (name = "minimum_quantity")
    private int minimumQuantity;

    @Column (name = "product_status")
    private boolean productStatus;

    public Product () {}

    public Product (ProductDtoRequest request) {}

    public Product(String productId, String productName,
                   String productDescription, Category category,
                   int currentQuantity, int minimumQuantity,
                   boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.category = category;
        this.currentQuantity = currentQuantity;
        this.minimumQuantity = minimumQuantity;
        this.productStatus = productStatus;
    }
}

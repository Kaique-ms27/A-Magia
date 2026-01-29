package com.example.magia.dto.resquest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDtoRequest {
    private String productName;
    private String productDescription;
    private Long productCategory;
    private int currentQuantity;
    private int minimumQunatity;
    private boolean productStatus;

}

package com.example.magia.dto.resquest;

import lombok.Getter;

@Getter
public class ProductDtoRequest {
    private String productName;
    private String productDescription;
    private Long productCategory;
    private Integer currentQuantity;
    private Integer minimumQuantity;
    private Boolean productStatus;

}

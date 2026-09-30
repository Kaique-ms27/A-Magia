package com.example.magia.controller;

import com.example.magia.dto.response.ProductDtoResponse;
import com.example.magia.dto.resquest.ProductDtoRequest;
import com.example.magia.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductDtoResponse saveProduct(@RequestBody ProductDtoRequest request){
        return productService.save(request);
    }

    @GetMapping
    public ResponseEntity<List<ProductDtoResponse>> listProduct() {
        return ResponseEntity.ok(productService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<ProductDtoResponse>> deleteProduct(@PathVariable String id) {
        ResponseEntity.ok("Excluído com Sucesso");
        return ResponseEntity.ok(productService.deleteProduct(id));
    }
}

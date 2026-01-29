package com.example.magia.controller;

import com.example.magia.dto.response.ProductDtoResponse;
import com.example.magia.dto.resquest.ProductDtoRequest;
import com.example.magia.model.Product;
import com.example.magia.repository.ProductRepository;
import com.example.magia.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {
    /*
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Produto recebido: " + product);

        var id = UUID.randomUUID().toString();
        product.setProductId(id);
        productRepository.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }

   */

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductDtoResponse saveProduct(@RequestBody ProductDtoRequest request){
        return productService.save(request);
    }
}

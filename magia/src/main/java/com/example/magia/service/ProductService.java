package com.example.magia.service;

import com.example.magia.dto.response.ProductDtoResponse;
import com.example.magia.dto.resquest.ProductDtoRequest;
import com.example.magia.model.Product;
import com.example.magia.model.ProductCategory;
import com.example.magia.repository.CategoryRepository;
import com.example.magia.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

@Service
public class ProductService {

    /*
        Criação de duas constantes para uso no código.
        Creating two constants for use in the code.
     */
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository,
                          CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    /*
        Método para salvar um produto.
        A method for saving a product.
     */
    public ProductDtoResponse save(ProductDtoRequest request) {

        /*
            Criação de um objeto Product para salvar as informações
            de modo manual.
            Creating a Product object to manually save the information.
         */
        Product product = new Product();

        /*
            Gera um id aleatório automático do tipo String para o produto.
            Generates an automatic random String ID for the product.
         */
        var id = UUID.randomUUID().toString();
        product.setProductId(id);

        /*
            Procura o ID da categoria no banco, caso ele não exista retorna
            categoria não encontrada.
            Searches for the category ID in the database;
            if it does not exist, returns "category not found".
         */
        ProductCategory category = categoryRepository.findById(request
                .getProductCategory())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        /*
            Cria uma validação caso o nome do produto seja vazio. Caso esteja
            retorna que o valor não pode estar vazio.
            Creates a validation if the product name is empty. If it is empty,
            it returns that the value cannot be empty.
         */
        if (request.getProductName().isBlank()) {
            throw new ResponseStatusException(HttpStatus
                    .BAD_REQUEST, "The product name cannot be empty.");
        } else {
            product.setProductName(request.getProductName());
        }

        /*
            Cria uma validação para que a quantidade atual não seja menor ou
            igual a 0. Caso aconteça, retorna que o valor não é aceito.
            Creates a validation to ensure the current quantity is not less
            than or equal to 0. If this happens, it
            returns that the value is not accepted.
         */
        if (request.getCurrentQuantity() <= 0) {
            throw new ResponseStatusException(HttpStatus
                    .BAD_REQUEST,
                    "The quantity entered cannot be less than or equal to 0.");
        } else {
            product.setCurrentQuantity(request.getCurrentQuantity());
        }

        /*
            Restante dos atributos sendo salvos através do DtoRequest.
            The remaining attributes are being saved via DtoRequest.
         */
        product.setMinimumQuantity(request.getMinimumQunatity());
        product.setProductStatus(request.isProductStatus());
        product.setProductDescription(request.getProductDescription());
        product.setProductCategory(category);

        /*
            Salva o produto.
            Save the product.
         */
        productRepository.save(product);

        /*
            Retorno do DtoResponse.
            DtoReponse return.
         */
        return new ProductDtoResponse(product);

    }
}

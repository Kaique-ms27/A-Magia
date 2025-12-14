package com.example.magia.controller.api;

import com.example.magia.dto.request.ProdutoDTORequest;
import com.example.magia.dto.response.ProdutoDTOResponse;
import com.example.magia.repository.ProdutoRepository;
import com.example.magia.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<ProdutoDTOResponse> criar(
            @RequestBody ProdutoDTORequest dtoRequest) {
        ProdutoDTOResponse response = produtoService.criar(dtoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}

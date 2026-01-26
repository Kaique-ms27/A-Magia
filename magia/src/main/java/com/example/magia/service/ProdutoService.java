package com.example.magia.service;

import com.example.magia.dto.request.ProdutoDTORequest;
import com.example.magia.dto.response.ProdutoDTOResponse;
import com.example.magia.model.Produto;
import com.example.magia.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService (ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoDTOResponse criar (ProdutoDTORequest dtoRequest) {
        Produto produto = new Produto(
                dtoRequest.getNome(),
                dtoRequest.getDescricao(),
                dtoRequest.getCategoria(),
                dtoRequest.getQuantidadeAtual(),
                dtoRequest.getQuantidadeMinima(),
                dtoRequest.isAtivacao()
        );

        var id = UUID.randomUUID().toString();
        produto.setId(id);
        Produto salvo = produtoRepository.save(produto);

        ProdutoDTOResponse response = new ProdutoDTOResponse();
        response.setId(salvo.getId());
        response.setNome(salvo.getNome());
        response.setDescricao(salvo.getDescricao());
        response.setQuantidadeAtual(salvo.getQuantidadeAtual());
        response.setQuantidadeMinima(salvo.getQuantidadeMinima());
        response.setAtivacao(salvo.isAtivacao());
        response.setCategoria(salvo.getCategoria());

        return response;

    }
}

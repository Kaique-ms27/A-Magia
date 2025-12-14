package com.example.magia.dto.request;

import com.example.magia.model.Produto;
import lombok.Data;
import org.springframework.beans.BeanUtils;


// Nesta classe será realizado o controle do que o cliente enviará para a API
@Data
public class ProdutoDTORequest {
    private String nome;
    private String descricao;
    private int categoria;
    private int quantidadeAtual;
    private int quantidadeMinima = 10;
    private boolean ativacao = false;

    public ProdutoDTORequest(Produto produto) {
        BeanUtils.copyProperties(produto, this);
    }



    public ProdutoDTORequest() {}
}

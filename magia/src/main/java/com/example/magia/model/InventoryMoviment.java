package com.example.magia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "InventoryMoviment")
public class InventoryMoviment {

    @Id
    @Column(name = "moviment_id")
    private String movimentId;

    @ManyToOne
    @JoinColumn(name = "moviment_product")
    private Product product;

    @Column(name = "moviment_type")
    private movimentType type;

    @Column(name = "moviment_quantity")
    private int movimentQuantity;

    @JoinColumn(name = "moviment_User")
    @ManyToOne
    private User user;

    @Column(name = "moviment_reason")
    private String reason;

    @Column(name = "moviment_date")
    private LocalDateTime date;

    public InventoryMoviment() {}

    public InventoryMoviment(String movimentId, Product product,
                             movimentType type, int movimentQuantity, User user,
                             String reason, LocalDateTime date) {
        this.movimentId = movimentId;
        this.product = product;
        this.type = type;
        this.movimentQuantity = movimentQuantity;
        this.user = user;
        this.reason = reason;
        this.date = date;
    }

    // Cria um enum para anotar a entrada ou saída do estoque
    // Creates an enum to record stock entries or exits.
    public enum movimentType {
        ENTRADA,
        SAIDA
    }
}
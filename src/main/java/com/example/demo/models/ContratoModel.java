package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate; 

@Entity
@Table(name = "contrato")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContratoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int contratoId;

    @Column(name = "evento_id")
    private int eventoId;

    @Column(name = "servico_id")
    private int servicoId;

    @Column(name = "fornecedor_id")
    private int fornecedorId;

    @Column(name = "contratante_id")
    private int contratanteId;

    @Column(name = "data_contrato")
    private LocalDate dataContrato; 

    @Column(name = "preco_final")
    private double precoFinal;

    @Column(name = "status_pagamento")
    private String statusPagamento;

    @Column(name = "metodo_pagamento")
    private String metodoPagamento;
}


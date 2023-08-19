package com.example.backendengin.dtos;

import lombok.Data;

@Data

public class FamilleDto {
    private String nomfamille;
    private int quantite;

    public FamilleDto(String nomfamille, int quantite) {
        this.nomfamille = nomfamille;
        this.quantite = quantite;
    }

}

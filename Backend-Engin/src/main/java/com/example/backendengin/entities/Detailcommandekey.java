package com.example.backendengin.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable

public class Detailcommandekey implements Serializable {
    @Column(name="demande_id")
    private Long demandeid;
    @Column(name="famille_id")
    private Long familleid;


}

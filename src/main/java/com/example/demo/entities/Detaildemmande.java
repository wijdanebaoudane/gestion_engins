package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity

public class Detaildemmande implements Serializable {
    @EmbeddedId
    private  Detailcommandekey id;
    private Long quantite;
    @ManyToOne()
    @MapsId("demandeid")
    @JoinColumn(name="demande_id")
    private Demande demande;
    @ManyToOne()
    @MapsId("familleid")
    @JoinColumn(name="famille_id")
    private Famille famille;



}

package com.example.demo.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Affectation implements Serializable {
    @EmbeddedId
    private  Affectation_key id;
    private  Date dateEntree;
    private  Date dateSortie;

    @ManyToOne()
    @MapsId("demandeid")
    @JoinColumn(name="demande_id")
    private Demande demande;

    @ManyToOne()
    @MapsId("enginsid")
    @JoinColumn(name="engins_id")
    private Engins engins;
}

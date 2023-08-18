package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Engins {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idengin;
    private boolean panne;
    private boolean disponibilite;
    @ManyToOne
    @JoinColumn(name = "idfamille")
    private Famille famille;
    @OneToMany(mappedBy = "engins",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Affectation> deatailengins;
    @OneToMany(mappedBy = "engins",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Composantpanne> composantpannes;


}
package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class Composantpannekey implements Serializable {
    @Column(name="composant_id")
    private Long composantid;
    @Column(name="engins_id")
    private Long enginsid;

}

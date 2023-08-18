package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable

public class Affectation_key implements Serializable {

    @Column(name="demande_id")
    private Long demandeid;
    @Column(name="engins_id")
    private Long enginsid;
}

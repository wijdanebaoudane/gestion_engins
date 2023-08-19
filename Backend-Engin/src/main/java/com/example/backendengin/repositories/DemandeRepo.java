package com.example.backendengin.repositories;

import com.example.demo.entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemandeRepo extends JpaRepository<Demande,Long> {
}

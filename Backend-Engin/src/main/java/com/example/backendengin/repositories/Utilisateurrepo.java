package com.example.backendengin.repositories;

import com.example.backendengin.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface Utilisateurrepo extends JpaRepository<Utilisateur,Long> {
    Optional<Utilisateur> findByEmail(String email);

}

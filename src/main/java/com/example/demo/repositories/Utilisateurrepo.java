package com.example.demo.repositories;

import com.example.demo.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Utilisateurrepo extends JpaRepository<Utilisateur,Long> {

}

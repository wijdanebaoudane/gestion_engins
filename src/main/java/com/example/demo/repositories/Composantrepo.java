package com.example.demo.repositories;

import com.example.demo.entities.Composant;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface Composantrepo extends JpaRepository<Composant,Long> {




}

package com.example.demo.repositories;

import com.example.demo.entities.Detaildemmande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Detaildemanderepo extends JpaRepository<Detaildemmande,Long> {
}

package com.example.demo.repositories;

import com.example.demo.entities.Engins;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Enginrepo extends JpaRepository<Engins,Long> {
}

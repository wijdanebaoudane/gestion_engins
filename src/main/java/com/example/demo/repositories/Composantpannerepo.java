package com.example.demo.repositories;

import com.example.demo.entities.Composant;
import com.example.demo.entities.Composantpanne;
import com.example.demo.entities.Composantpannekey;
import com.example.demo.entities.Engins;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public interface Composantpannerepo extends JpaRepository<Composantpanne, Composantpannekey> {

    Optional<Composantpanne> findByEnginsAndComposant(Engins engins, Composant composant);

    @Modifying
    @Transactional
    @Query(value = "delete from Composantpanne c where c.id.enginsid=:idengin ")
    void deletebyidengin(@Param("idengin") Long idengin);
}

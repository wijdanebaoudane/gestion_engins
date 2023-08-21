package com.example.demo.repositories;

import com.example.demo.entities.Composantsortie;
import com.example.demo.entities.Composantsortiekey;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface ComposantSorieRepo extends JpaRepository<Composantsortie, Composantsortiekey> {
    @Modifying
    @Transactional
    @Query(value = "delete from Composantsortie c where c.id.idengin=:idengin and c.id.iddemande=:iddemande ")
    void deletebyidengin(@Param("idengin") Long idengin, @Param("iddemande") Long iddemande);
}

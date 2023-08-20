package com.example.demo.repositories;

import com.example.demo.entities.ComposantEntree;
import com.example.demo.entities.Composantsortiekey;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ComposantEntreeRepo extends JpaRepository<ComposantEntree, Composantsortiekey> {
    @Modifying
    @Transactional
    @Query(value = "delete from ComposantEntree c where c.id.idengin=:idengin and c.id.iddemande=:iddemande ")
    void deletebyidengin(@Param("idengin") Long idengin, @Param("iddemande") Long iddemande);
}

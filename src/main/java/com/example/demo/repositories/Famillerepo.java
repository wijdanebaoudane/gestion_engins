package com.example.demo.repositories;

import com.example.demo.entities.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Famillerepo extends JpaRepository<Famille,Long> {
    @Query( "SELECT DISTINCT f FROM Famille f " +
            "JOIN f.detaildemmandes d " +
            "JOIN d.demande de " +
            "WHERE de.iddemande = :iddemande")
    List<Famille> findByDemandeId(@Param("iddemande") Long iddemande);
}

package com.example.backendengin.service;

import com.example.backendengin.entities.Utilisateur;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    UserDetailsService userDetailsService();
    List<Utilisateur> findAllUsers();

    void DeleteUser(Long id_user);

    void AddNewUser(Utilisateur user);

    void UpdateUserPassword(String mdp, Long id_user);
}

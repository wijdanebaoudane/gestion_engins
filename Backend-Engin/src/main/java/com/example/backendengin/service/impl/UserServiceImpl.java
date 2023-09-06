package com.example.backendengin.service.impl;

import com.example.backendengin.entities.Utilisateur;
import com.example.backendengin.repositories.Utilisateurrepo;
import com.example.backendengin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

   private final Utilisateurrepo userRepository;

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username){
                return userRepository.findByEmail(username)
                        .orElseThrow(()->new UsernameNotFoundException("User not found"));
            }
        };
    }
    @Override
    public List<Utilisateur> findAllUsers(){
        return userRepository.findAll();
    }
    @Override
     public void DeleteUser(Long id_user){
        userRepository.deleteById(id_user);
    }
    @Override
     public void AddNewUser(Utilisateur  user){
        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
        String password = bcryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(password);
        userRepository.save(user);
    }
//    @Override
//     public void UpdateUserToken(Long id_user, String token){
//        Utilisateur user=userRepository.findById(id_user).orElseThrow(()->new RuntimeException("User not found  "));
//        user.setToken(token);
//        userRepository.save(user);
//    }
    @Override
     public void UpdateUserPassword(String mdp, Long id_user){
        Utilisateur user=userRepository.findById(id_user).orElseThrow(()->new RuntimeException("User not found "));
        user.setPassword(mdp);
        userRepository.save(user);
    }



}

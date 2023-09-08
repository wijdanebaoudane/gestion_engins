package com.example.backendengin.service;


import com.example.backendengin.dtos.request.SignUpRequest;
import com.example.backendengin.dtos.request.SigninRequest;
import com.example.backendengin.dtos.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}

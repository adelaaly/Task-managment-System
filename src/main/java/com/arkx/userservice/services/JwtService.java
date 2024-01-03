package com.arkx.userservice.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface JwtService {
    String extractUserName(String token);
    String generateToken(UserDetails userDetails);
    public  boolean isTokenValid(String token, UserDetails userDetails);
    }

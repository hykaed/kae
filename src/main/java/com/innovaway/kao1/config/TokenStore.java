package com.innovaway.kao1.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@Component
public class TokenStore {
    private final Map<String, Authentication> cache = new HashMap<>();

    public String generatToken(Authentication authentication){
        String token=UUID.randomUUID().toString();
        cache.put(token,authentication);
        return token;
    }

    public Authentication getToken(String token){
        return cache.getOrDefault(token,null);



    }
}

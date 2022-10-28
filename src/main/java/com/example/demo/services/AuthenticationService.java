package com.example.demo.services;

import com.example.demo.entities.Authentication;
import com.example.demo.entities.UserMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class AuthenticationService {

    @Autowired
    private RestTemplate template;

    @PostMapping
    public Authentication getAuthentication(){
        UserMock user = new UserMock();
        HttpEntity<UserMock> request = new HttpEntity<>(user, new HttpHeaders());

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api.infotravel.com.br")
                .path("api/v1/authenticate")
                .queryParam("username", user.getUsername())
                .queryParam("password", user.getPassword())
                .queryParam("client", user.getClient())
                .queryParam("agency", user.getAgency())
                .build();

        return template.postForObject(uri.toString(), request, Authentication.class);
    }
}

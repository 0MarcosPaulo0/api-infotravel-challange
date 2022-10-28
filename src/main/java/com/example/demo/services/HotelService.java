package com.example.demo.services;

import com.example.demo.entities.Authentication;
import com.example.demo.entities.HotelDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;

@Service
public class HotelService {

    @Autowired
    private RestTemplate template;

    @GetMapping
    public HotelDetail getHotel(String keyDetail, Authentication auth){

        HttpHeaders headers = new HttpHeaders();

        headers.set("Authorization", auth.getType() + " " + auth.getAccessToken());
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<?> request = new HttpEntity<>(headers);

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api.infotravel.com.br")
                .path("api/v1/utility/hotelDetail/" + keyDetail).build();

        ResponseEntity<HotelDetail> response = template
                .exchange(uri.toString(), HttpMethod.GET, request, HotelDetail.class);

        return response.getBody();
    }
}

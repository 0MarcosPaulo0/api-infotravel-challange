package com.example.demo.services;

import com.example.demo.entities.Authentication;
import com.example.demo.entities.SearchHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;

@Service
public class SearchService {

    @Autowired
    private RestTemplate template;

    @GetMapping
    public SearchHotel getHotels(String destination, String start, String end, String occupancy, Authentication auth){
        HttpHeaders headers = new HttpHeaders();

        headers.set("Authorization", auth.getType() + " " + auth.getAccessToken());
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<?> request = new HttpEntity<>(headers);

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api.infotravel.com.br")
                .path("api/v1/avail/hotel")
                .queryParam("destination", destination)
                .queryParam("start", start)
                .queryParam("end", end)
                .queryParam("occupancy", occupancy)
                .build();

        ResponseEntity<SearchHotel> response = template
                .exchange(uri.toString(), HttpMethod.GET, request, SearchHotel.class);

        return response.getBody();
    }

}

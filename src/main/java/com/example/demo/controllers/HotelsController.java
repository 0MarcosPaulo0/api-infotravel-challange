package com.example.demo.controllers;


import com.example.demo.entities.HotelDetail;
import com.example.demo.entities.SearchHotel;
import com.example.demo.services.AuthenticationService;
import com.example.demo.services.HotelService;
import com.example.demo.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hotels")
public class HotelsController {
    @Autowired
    private SearchService searchService;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private AuthenticationService auth;

    @GetMapping("/search")
    public SearchHotel getHotelAvail(@RequestParam String destination,
                                     @RequestParam String start,
                                     @RequestParam String end,
                                     @RequestParam String occupancy){
        return searchService.getHotels(destination, start, end, occupancy, auth.getAuthentication());
    }

    @GetMapping("/hotel")
    public HotelDetail getHotelDetail(@RequestParam String keyDetail){
        return hotelService.getHotel(keyDetail, auth.getAuthentication());
    }
}

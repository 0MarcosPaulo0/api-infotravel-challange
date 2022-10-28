package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HotelAvail {

    public Hotel hotel;
    public String provider;
    public LowestFare lowestFare;

}

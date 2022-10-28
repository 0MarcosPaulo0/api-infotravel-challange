package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class SearchHotel {

    public ArrayList<HotelAvail> hotelAvail;

}

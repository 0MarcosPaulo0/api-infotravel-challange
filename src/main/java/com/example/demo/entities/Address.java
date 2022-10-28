package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {

    public String address;
    public City city;
    public Coordinates coordinates;

}

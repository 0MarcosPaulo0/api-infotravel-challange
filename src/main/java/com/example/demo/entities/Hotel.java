package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Hotel {

    public Integer id;
    public String name;
    public String KeyDetail;
    public String description;
    public Address address;
    public Double stars;
    public ArrayList<Image> images;
    public ArrayList<Attribute> attributes;

}

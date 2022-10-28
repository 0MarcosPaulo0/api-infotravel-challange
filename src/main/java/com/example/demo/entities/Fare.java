package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fare {

    public String type;
    public Price price;
    public PriceNet priceNet;

}

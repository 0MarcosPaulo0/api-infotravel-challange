package com.example.demo.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PriceNet {

    public String currency;
    public double amount;

}

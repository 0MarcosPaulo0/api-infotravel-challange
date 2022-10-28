package com.example.demo.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Price {

    public String currency;
    public double amount;

}

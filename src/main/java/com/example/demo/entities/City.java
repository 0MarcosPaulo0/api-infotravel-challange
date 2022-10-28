package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class City {

    public String name;
    public Country country;

}

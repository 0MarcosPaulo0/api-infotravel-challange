package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Attribute {

    public String name;
    public ArrayList<Item> items;

}

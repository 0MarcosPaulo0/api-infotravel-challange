package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Penalty {

    public Date from;
    public String description;

}

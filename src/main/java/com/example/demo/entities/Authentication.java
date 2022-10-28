package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Authentication {

    private String accessToken;
    private String type;

}

package com.example.demo.entities;

import lombok.Data;

@Data
public class UserMock {
    private String username;
    private String password;
    private String client;
    private String agency;
    private String authentication;

    public UserMock(){
        this.username = "sandboxws";
        this.password = "!sdb2022#";
        this.client = "SANDBOX";
        this.agency = "2";
    }
}

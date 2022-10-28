package com.example.demo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class LowestFare {

    public RoomType roomType;
    public ArrayList<Fare> fares;
    public ArrayList<BoardType> boardTypes;
    public CancellationPolicies cancellationPolicies;
    public String checkOut;

}

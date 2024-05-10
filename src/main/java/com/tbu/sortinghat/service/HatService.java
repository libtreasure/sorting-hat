package com.tbu.sortinghat.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class HatService {
    public String getHat(){
        //add code here
        List<String> houses = List.of("Slytherin", "Gryffindor", "Hufflepuff", "Ravenclaw");

        Random random = new Random();
        int randomIndex = random.nextInt(houses.size());

        return houses.get(randomIndex);
    }

}

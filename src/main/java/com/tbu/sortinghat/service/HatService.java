package com.tbu.sortinghat.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HatService {

    static final List<String> options = List.of("Hotelpuff!", "Ridesclaw!", "Gryffinsure!", "Slythcarin!");
    static final List<String> darkLords = List.of("Tom", "Voldemort");

    public String getHouse(String name) {
        String house;
        if (name.toLowerCase().charAt(0) == 'h') {
            house = options.get(2);
        } else if (darkLords.contains(name)){
            return "Dark Lords are not permitted to work here!";
        } else {
            int index = (int) Math.floor(Math.random() * 4);
            house = options.get(index);

        }
        return name + ", you are in " + house;
    }
}

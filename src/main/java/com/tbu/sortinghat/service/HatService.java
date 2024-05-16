package com.tbu.sortinghat.service;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class HatService {
    static final String gryffinsure = "Gryffinsure";
    static final List<String> options = List.of("Hotelpuff", "Ridesclaw", gryffinsure, "Slythcarin");
    static final List<String> darkLords = List.of("Tom", "Voldemort");

    HashMap<String, String> personHouseMap = new HashMap<>();

    public String getHouse(String... names) {
        if(Objects.isNull(names) || names.length == 0 || Strings.isEmpty(names[0])) {
            return "No name provided";
        }

        String house;
        String firstName = names[0];
        String lastName = names.length == 2 ? names[1] : null;
        if (firstName.toLowerCase().charAt(0) == 'h') {
            house = gryffinsure;
        } else if (darkLords.contains(firstName)){
            return "Dark Lords are not permitted to work here!";
        } else {
            house = getRandomHouse(lastName);
        }
        return String.format("%s, you are in %s!", firstName, house);
    }

    private String getRandomHouse(String lastName) {
        String house;
        if (Objects.nonNull(lastName) && personHouseMap.containsKey(lastName)) {
            house = personHouseMap.get(lastName);
        } else {
            int index = (int) Math.floor(Math.random() * 4);
            house = options.get(index);
            personHouseMap.put(lastName, house);
        }
        return house;
    }
}

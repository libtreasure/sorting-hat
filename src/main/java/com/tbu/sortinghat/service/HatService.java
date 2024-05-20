package com.tbu.sortinghat.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HatService {
    private static final Map<Integer,String> nameMap = new HashMap<>();
    public String getHouse(String name) {
        nameMap.put(0,"Hotelpuff");
        nameMap.put(1,"Ridesclaw");
        nameMap.put(2,"Gryffinsure");
        nameMap.put(3,"Slythcarin");
        name = name.toLowerCase();
        String houseName;
        String result;
        if(name.equalsIgnoreCase("tom") || name.equalsIgnoreCase("voldemort")) {
            return "Dark Lords are not permitted to work here!";
        }
        int randomNum = (int)(Math.random() * 3);
        System.out.println(randomNum);
        if(name.startsWith("h")){
            houseName = nameMap.get(2);
        } else {
            houseName = nameMap.get(randomNum);
        }
        System.out.println(houseName);
        result = "Hi " + name + " you are in " + houseName;
        return result;
    }
}

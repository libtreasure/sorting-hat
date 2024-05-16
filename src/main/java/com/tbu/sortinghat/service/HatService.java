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

        int randomNum = (int)(Math.random() * 3);
        System.out.println(randomNum);
        String houseName = nameMap.get(randomNum);
        System.out.println(houseName);
        return houseName;
    }
}

package com.hogwarts.sortinghat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SlytherinRepo {


    public static void main(String[] args) {
        SpringApplication.run(SlytherinRepo.class, args);


    }
}

//    public String getName() {
//        Scanner scanner = new Scanner;
//        System.out.println("Please enter your name");
//        String name = scanner.nextLine();
//
//        return name;
//    }
//
//    public String pickHouse(String name) {
//        this.name = name;
//
//        String[] letters = name.split("");
//        if (letters[0].equals("A")) {
//            house.equals("Slytherin");
//        } else if (letters[0].equals("L")) {
//            house.equals("Gryffindor");
//        } else if (letters[0].equals("H")) {
//            house.equals("Hufflepuff");
//        } else if (letters[0].equals("R")) {
//            house.equals("Ravenclaw");
//        }
//        return name + " you are in " + house + "!";
//    }
//}

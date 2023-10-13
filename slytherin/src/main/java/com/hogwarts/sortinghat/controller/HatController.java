package com.hogwarts.sortinghat.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/")
public class HatController {

    @GetMapping("/hat")
    public ResponseEntity<String> getHat()
    {
        return ResponseEntity.ok("Gryffindor!");
    }

}

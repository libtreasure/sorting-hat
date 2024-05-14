package com.tbu.sortinghat.controller;

import com.tbu.sortinghat.service.HatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/v1")
@RestController
@RequiredArgsConstructor
public class HatController {

    private final HatService hatService;

    @GetMapping("/house/{name}")
    public ResponseEntity<String> getHouse(@PathVariable String name){

        String result = hatService.getHouse(name);

        return ResponseEntity.ok(result);
    }

}

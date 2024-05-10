package com.tbu.sortinghat.controller;

import com.tbu.sortinghat.service.HatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1")
@RestController
@RequiredArgsConstructor
public class HatController {
    private final HatService hatService;

    @GetMapping("/house")
    public ResponseEntity<String> getHouse(){
        return ResponseEntity.ok(hatService.getHat());
    }

}

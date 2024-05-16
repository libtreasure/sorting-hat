package com.tbu.sortinghat.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HatServiceTest {
    HatService hatService;

    static final List<String> options = List.of("Hotelpuff", "Ridesclaw", "Gryffinsure", "Slythcarin");

    @BeforeEach
    public void setUp() {
        hatService = new HatService();
    }

    @Test
    void testNameIsNull() {
        String result = hatService.getHouse((String) null);
        assertEquals("No name provided", result);
    }

    @Test
    void testEmptyNames() {
        String result = hatService.getHouse();
        assertEquals("No name provided", result);
    }

    @Test
    void testHouse() {
        String result = hatService.getHouse("abv");
        assertNotNull(result);
        assertTrue(options.stream().anyMatch(house -> result.endsWith(house + "!")));
    }

    @Test
    void testPersonalisedGreeting() {
        String result = hatService.getHouse("abv");
        assertTrue(result.startsWith("abv, you are in "));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Harry", "Homer"})
    void testNameStartsWithH(String name) {
        String result = hatService.getHouse(name);
        assertEquals(result, name + ", you are in Gryffinsure!");
    }

    @ParameterizedTest
    @ValueSource(strings = { "Tom", "Voldemort"})
    void testDarkLords(String name) {
        String result = hatService.getHouse(name);
        assertEquals(result, "Dark Lords are not permitted to work here!");
    }

    @Test
    void testLastName() {
        String firstCall = hatService.getHouse("FirstName", "LastName");
        String secondCall = hatService.getHouse("FirstName", "LastName");
        assertTrue(firstCall.startsWith("FirstName, you are in "));
        assertEquals(firstCall, secondCall);
    }
}
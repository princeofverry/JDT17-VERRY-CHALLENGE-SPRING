package com.indivaragroup.spring.dasar.config.challenge.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StoreInfoServiceTest {

    @Autowired
    private StoreInfoService storeInfoService;

    @Test
    void shouldReturnStoreInformation() {

        String result = storeInfoService.getStoreInfo();

        assertTrue(result.contains("Indivara Mini Store"));
        assertTrue(result.contains("Jakarta"));
        assertTrue(result.contains("IDR"));
    }
}
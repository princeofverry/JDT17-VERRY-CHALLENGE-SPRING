package com.indivaragroup.spring.dasar.config.challenge.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StorePropertiesTest {

    @Autowired
    private StoreProperties storeProperties;

    @Test
    void shouldLoadYamlProperties() {
        assertEquals(
                "Indivara Mini Store",
                storeProperties.getName()
        );

        assertEquals(
                "Jakarta",
                storeProperties.getCity()
        );

        assertEquals(
                "IDR",
                storeProperties.getCurrency()
        );

        assertEquals(
                100,
                storeProperties.getMaxDailyOrder()
        );

        assertTrue(storeProperties.getActive());
    }
}

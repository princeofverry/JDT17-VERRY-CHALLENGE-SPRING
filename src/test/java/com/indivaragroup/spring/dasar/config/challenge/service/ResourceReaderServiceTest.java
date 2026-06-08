package com.indivaragroup.spring.dasar.config.challenge.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ResourceReaderServiceTest {

    @Autowired
    private ResourceReaderService service;

    @Test
    void shouldReadBanner() {

        String banner = service.readBanner();

        assertNotNull(banner);

        assertTrue(
                banner.contains("INDIVARA MINI STORE")
        );
    }
}
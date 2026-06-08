package com.indivaragroup.spring.dasar.config.challenge.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingMessageServiceTest {

    @Autowired
    private GreetingMessageService service;

    @Test
    void shouldReturnEnglishGreeting() {

        String result =
                service.getGreeting(Locale.ENGLISH);

        assertTrue(
                result.contains("Welcome to")
        );
    }

    @Test
    void shouldReturnIndonesianGreeting() {

        String result =
                service.getGreeting(new Locale("id"));

        assertTrue(
                result.contains("Selamat datang")
        );
    }
}
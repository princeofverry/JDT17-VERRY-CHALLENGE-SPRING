package com.indivaragroup.spring.dasar.config.challenge.service;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
public class ResourceReaderService {
    private final ResourceLoader resourceLoader;

    public ResourceReaderService(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public String readBanner() {

        try {
            Resource resource = resourceLoader.getResource("classpath:banner-store.txt");
            return new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

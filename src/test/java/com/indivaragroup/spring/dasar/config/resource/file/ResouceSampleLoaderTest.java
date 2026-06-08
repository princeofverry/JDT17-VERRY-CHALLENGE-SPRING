package com.indivaragroup.spring.dasar.config.resource.file;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;


@SpringBootTest
public class ResouceSampleLoaderTest {
    @Autowired
    private ResourceSampleLouder resourceSampleLouder;

    @Test
    void testResourceLoader() throws IOException {
        resourceSampleLouder.sampleResource();
    }
}

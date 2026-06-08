package com.indivaragroup.spring.dasar.config.resource.file;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class ResourceSample {

    private ApplicationContext applicationContext;

    @PostConstruct
    public void sampleResource() throws IOException {
        Resource resource = new ClassPathResource("/media/file/test.json");

        String content = resource.getContentAsString(StandardCharsets.UTF_8);
        System.out.println(content);
    }
}

package com.indivaragroup.spring.dasar.config.challenge.runner;

import com.indivaragroup.spring.dasar.config.challenge.service.GreetingMessageService;
import com.indivaragroup.spring.dasar.config.challenge.service.ResourceReaderService;
import com.indivaragroup.spring.dasar.config.challenge.service.StoreInfoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements CommandLineRunner {
    private final StoreInfoService storeInfoService;
    private final ResourceReaderService resourceReaderService;
    private final GreetingMessageService greetingMessageService;

    public AppRunner(StoreInfoService storeInfoService, ResourceReaderService resourceReaderService, GreetingMessageService greetingMessageService) {
        this.storeInfoService = storeInfoService;
        this.resourceReaderService = resourceReaderService;
        this.greetingMessageService = greetingMessageService;
    }

    @Override
    public void run(String... args) {
        System.out.println(resourceReaderService.readBanner());

        System.out.println(storeInfoService.getStoreInfo());

        System.out.println("EN");
        System.out.println(greetingMessageService.getGreeting(Locale.ENGLISH));
        System.out.println(greetingMessageService.getStatus(Locale.ENGLISH));

        System.out.println();

        System.out.println("ID");
        System.out.println(greetingMessageService.getGreeting(new Locale("id")));
        System.out.println(greetingMessageService.getStatus(new Locale("id")));
    }
}

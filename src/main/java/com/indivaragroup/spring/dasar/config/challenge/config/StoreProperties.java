package com.indivaragroup.spring.dasar.config.challenge.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "store")
@Data
@Component
public class StoreProperties {
    private String name;
    private String city;
    private String currency;
    private Integer maxDailyOrder;
    private Boolean active;
}

package com.indivaragroup.spring.dasar.config.challenge.service;

import com.indivaragroup.spring.dasar.config.challenge.config.StoreProperties;
import org.springframework.stereotype.Service;

@Service
public class StoreInfoService {
    private final StoreProperties storeProperties;

    public StoreInfoService(StoreProperties storeProperties) {
        this.storeProperties = storeProperties;
    }

    public String getStoreInfo() {
        return """
        Store Name : %s
        Store City : %s
        Currency : %s
        Max Daily Order : %d
        Active : %s
        """
        .formatted(
                storeProperties.getName(),
                storeProperties.getCity(),
                storeProperties.getCurrency(),
                storeProperties.getMaxDailyOrder(),
                storeProperties.getActive()
        );
}
}

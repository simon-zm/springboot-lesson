package com.simon.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SimonConfig {

    @Bean
    public SimonCore getSimonCore(){
        return new SimonCore();
    }
}

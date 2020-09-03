package com.nghich.banned.movie.congifgurations;

import com.nghich.banned.movie.services.CinameService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public CinameService cinameService () {
        return new CinameService();
    }
}

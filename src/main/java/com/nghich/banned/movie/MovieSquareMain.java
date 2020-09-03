package com.nghich.banned.movie;

import com.nghich.banned.movie.congifgurations.AppConfig;
import com.nghich.banned.movie.services.CinameService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieSquareMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        CinameService cinameService = ctx.getBean(CinameService.class);
        cinameService.logCallService();
    }

}

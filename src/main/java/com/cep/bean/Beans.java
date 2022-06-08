package com.cep.bean;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Beans {

    @Bean
    Gson gson(){
        return new Gson();
    }
}

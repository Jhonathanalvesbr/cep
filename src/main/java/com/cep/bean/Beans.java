package com.cep.bean;

import com.cep.mapper.Mapear;
import com.cep.mapper.PessoaMapear;
import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Beans {

    @Bean
    Gson gson(){
        return new Gson();
    }

    @Bean
    PessoaMapear pessoaMapear() {return new PessoaMapear();}
}

package com.cep.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PessoaMapear {
    @Autowired
    Mapear mapear;
    public PessoaMapear(){
        this.mapear = Mapear.INSTANCE;
    }
}

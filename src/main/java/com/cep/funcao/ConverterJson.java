package com.cep.funcao;

import com.cep.dto.CepDTO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConverterJson {
    @Autowired
    Gson gson;

    public CepDTO converter(String json){
        return gson.fromJson(json, CepDTO.class);
    }
}

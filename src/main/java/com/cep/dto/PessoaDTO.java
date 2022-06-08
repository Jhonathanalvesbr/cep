package com.cep.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PessoaDTO {
    private long id;
    private String nome;
    private CepDTO cep;
}

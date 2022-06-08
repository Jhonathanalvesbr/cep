package com.cep.dto;

import com.cep.entidade.Cep;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class PessoaDTO {
    private long id;
    private String nome;
    private List<CepDTO> cep;
}

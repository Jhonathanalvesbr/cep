package com.cep.dto;

import com.cep.entidade.Cep;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    private long id;
    private String nome;
    private List<CepDTO> cep;
}

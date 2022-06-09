package com.cep.servico;

import com.cep.dto.PessoaDTO;
import com.cep.entidade.Pessoa;
import com.cep.mapear.PessoaMapear;
import com.cep.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PessoaServico {
    @Autowired
    PessoaRepositorio pessoaRepositorio;
    @Autowired
    PessoaMapear pessoaMapear = PessoaMapear.INSTANCE;

    public List<PessoaDTO> buscarTodos() {
        return pessoaRepositorio.findAll()
                .stream()
                .map(pessoaMapear::toDTO)
                .collect(Collectors.toList());
    }

    public void setPessoa(List<PessoaDTO> pessoaDTO) {
        for (PessoaDTO pessoa: pessoaDTO){
            pessoaRepositorio.save(pessoaMapear.toModel(pessoa));
        }
    }
}

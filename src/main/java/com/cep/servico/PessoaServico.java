package com.cep.servico;

import com.cep.dto.PessoaDTO;
import com.cep.mapear.PessoaMapear;
import com.cep.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PessoaServico {
    @Autowired
    PessoaRepositorio pessoaRepositorio;
    @Autowired
    PessoaMapear pessoaMapear = PessoaMapear.INSTANCE;

    public List<PessoaDTO> buscarId(){

        return pessoaRepositorio.findAll()
                .stream()
                .map(pessoaMapear::toDTO)
                .collect(Collectors.toList());
    }
}

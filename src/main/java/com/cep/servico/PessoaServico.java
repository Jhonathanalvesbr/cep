package com.cep.servico;

import com.cep.dto.PessoaDTO;
import com.cep.mapper.Mapear;
import com.cep.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PessoaServico {
    @Autowired
    PessoaRepositorio pessoaRepositorio;

    public ArrayList<PessoaDTO> buscarId(){
        Mapear mapear = Mapear.INSTANCE;
        System.out.println(pessoaRepositorio.toString());
        //ArrayList<PessoaDTO> pessoaDTOS = (ArrayList<PessoaDTO>) pessoaRepositorio.findAll().stream().map((pessoa) -> mapear.toDTO(pessoa));
        //System.out.println(pessoaDTOS.toString());
        return new ArrayList<PessoaDTO>();
    }
}

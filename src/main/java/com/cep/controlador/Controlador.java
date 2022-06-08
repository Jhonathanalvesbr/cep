package com.cep.controlador;

import com.cep.dto.PessoaDTO;
import com.cep.servico.PessoaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api/v1/pessoa")
public class Controlador {
    @Autowired
    PessoaServico pessoaServico;

    @GetMapping
    public List<PessoaDTO> getAllPessoa(){

        return pessoaServico.buscarId();
    }
}

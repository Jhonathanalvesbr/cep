package com.cep.controlador;

import com.cep.dto.PessoaDTO;
import com.cep.entidade.Pessoa;
import com.cep.servico.PessoaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/api/v1/pessoa")
public class Controlador {
    @Autowired
    PessoaServico pessoaServico;

    @GetMapping
    public List<PessoaDTO> getAllPessoa() {

        return pessoaServico.buscarTodos();
    }

    @PostMapping
    public void setPessoa(@RequestBody List<PessoaDTO> pessoaDTO) {
        pessoaServico.setPessoa(pessoaDTO);
    }

}

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

    @GetMapping("/{id}")
    public PessoaDTO buscarId(@PathVariable long id) {
        return pessoaServico.getPessoa(id);
    }

    @PostMapping
    public void setPessoa(@RequestBody List<PessoaDTO> pessoaDTO) {
        pessoaServico.setPessoa(pessoaDTO);
    }

    @DeleteMapping("{id}")
    public void deletarPessoa(@PathVariable long id){
        pessoaServico.deletarPessoa(id);
    }

    @PutMapping("/{id}")
    public void atualizarId(@PathVariable long id, @RequestBody PessoaDTO pessoaDTO){
        pessoaServico.atualizarPessoa(id, pessoaDTO);
    }

}

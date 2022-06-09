package com.cep.servico;

import com.cep.dto.PessoaDTO;
import com.cep.entidade.Pessoa;
import com.cep.mapear.PessoaMapear;
import com.cep.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public PessoaDTO getPessoa(long id) {
        return pessoaMapear.toDTO(pessoaRepositorio.findById(id).get());
    }

    public void atualizarPessoa(long id, PessoaDTO pessoaDTO) {
        pessoaRepositorio.save(pessoaMapear.toModel(pessoaDTO));
    }

    public void deletarPessoa(long id) {
        pessoaRepositorio.deleteById(id);
    }
}

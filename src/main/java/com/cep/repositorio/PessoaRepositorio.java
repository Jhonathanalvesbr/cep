package com.cep.repositorio;

import com.cep.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {

}

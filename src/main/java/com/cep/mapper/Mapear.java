package com.cep.mapper;

import com.cep.dto.PessoaDTO;
import com.cep.entidade.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Mapear {
    Mapear INSTANCE = Mappers.getMapper(Mapear.class);

    PessoaDTO toPessoa(Pessoa pessoa);

    Pessoa toDTO(PessoaDTO PessoaDTO);
}

package com.cep.mapear;

import com.cep.dto.PessoaDTO;
import com.cep.entidade.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel="spring")
public interface PessoaMapear {
    PessoaMapear INSTANCE  = Mappers.getMapper(PessoaMapear.class);

    Pessoa toModel(PessoaDTO pessoaDTO);

    PessoaDTO toDTO(Pessoa pessoa);

}

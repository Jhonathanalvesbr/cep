package com.cep.app;

import com.cep.dto.CepDTO;
import com.cep.dto.PessoaDTO;
import com.cep.entidade.Pessoa;
import com.cep.funcao.ConverterJson;
import com.cep.mapear.PessoaMapear;
import com.cep.repositorio.PessoaRepositorio;
import com.cep.servico.PessoaServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class App implements CommandLineRunner {
    @Autowired
    ConverterJson converterJson;
    @Autowired
    PessoaRepositorio pessoaRepositorio;

    @Override
    public void run(String... args) throws Exception {
        String json = "{\n" +
                "      \"cep\": \"01001-000\",\n" +
                "      \"logradouro\": \"Praça da Sé\",\n" +
                "      \"complemento\": \"lado ímpar\",\n" +
                "      \"bairro\": \"Sé\",\n" +
                "      \"localidade\": \"São Paulo\",\n" +
                "      \"uf\": \"SP\",\n" +
                "      \"ibge\": \"3550308\",\n" +
                "      \"gia\": \"1004\",\n" +
                "      \"ddd\": \"11\",\n" +
                "      \"siafi\": \"7107\"\n" +
                "    }\n" ;
        List<CepDTO> cep = new ArrayList<>();
        cep.add(converterJson.converter(json));

        PessoaDTO pessoaDTO = new PessoaDTO(1L,"Jhonathan",cep);
        //System.out.println(pessoaDTO.toString());

        Pessoa pessoa = PessoaMapear.INSTANCE.toModel(pessoaDTO);
        //System.out.println(pessoa.getCep());

        //pessoaRepositorio.save(pessoa);

    }
}

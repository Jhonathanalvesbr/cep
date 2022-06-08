package com.cep.entidade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Pessoa {
    @Id
    private long id;
    private String nome;
    @OneToMany
    private List<Cep> cep;

}

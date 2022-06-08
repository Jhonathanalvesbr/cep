package com.cep.entidade;

import com.cep.dto.CepDTO;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private long id;
    private String nome;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Cep> cep;

}

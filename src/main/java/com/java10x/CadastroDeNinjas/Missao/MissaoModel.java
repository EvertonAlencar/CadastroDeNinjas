package com.java10x.CadastroDeNinjas.Missao;

import com.java10x.CadastroDeNinjas.Ninja.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missao")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}

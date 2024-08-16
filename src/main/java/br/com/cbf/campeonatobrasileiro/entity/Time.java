package br.com.cbf.campeonatobrasileiro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    private String nome;
    @Column(length = 2)
    private String estadio;
    @Column(length = 3)
    private String sigla;
    @Column(length = 2)
    private String uf;

}

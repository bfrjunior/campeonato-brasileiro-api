package br.com.cbf.campeonatobrasileiro.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime data;
    private Integer golsTime1;
    private Integer golsTime2;
    private Integer publicoPagante;
    private Boolean encerrado;
    private Integer rodada;

    private Time time1;
    private Time time2;

}

package br.com.futurodev.primeiraapi.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter// getters e setters do lombok
@Entity
@Table(name = "cliente")
public class Cliente {

   @EqualsAndHashCode.Include // equals and hascode, se usar @data em cima da classe puxa equals full
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64)
    private String nome;

    @Column(unique = true,length = 11)
    private String cpf;

    private String rg;



}

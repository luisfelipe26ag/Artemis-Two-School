package com.artemistwoschool.artemis.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "turma")
@Entity
public class turma {
@Id
@GeneratedValue
@Column(name= "id")
private Integer id;

@Column(name = "nome")
private String nome;

@Column(name = "aluno")
private List<Aluno> aluno;

public turma(){
}

public turma(Integer id, String nome, List<Aluno> aluno ) {
    this.id = id;
    this.nome = nome;
    this.aluno = aluno;
}
     
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome  = nome;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }



}

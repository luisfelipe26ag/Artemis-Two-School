package com.artemistwoschool.artemis.models;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity // Define que esta classe é uma tabela no banco
@Table(name = "alunos")
public class Aluno {

    
   
    
        @Id // Define que este campo é a Chave Primária
        @GeneratedValue(strategy = GenerationType.IDENTITY) // O banco gera o ID automaticamente
        private Integer id;
    
        @Column(nullable = false) // O nome não pode ser vazio
        private String nome;
    
        private LocalDate dataNascimento;
    
        @Column(unique = true) // Não permite dois alunos com o mesmo e-mail
        private String email;

        public Aluno() {
        }

        public Aluno(Integer id, String nome, LocalDate dataNascimento, String email) {
            this.id = id;
            this.nome = nome;
            this.dataNascimento = dataNascimento;
            this.email = email;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    


        

        
    }
    








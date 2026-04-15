package com.artemistwoschool.artemis.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artemistwoschool.artemis.models.Aluno;



    
    @Repository
    public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

    }

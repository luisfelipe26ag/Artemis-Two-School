package com.artemistwoschool.artemis.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.artemistwoschool.artemis.models.turma;


@Repository
public interface TurmaRepository extends JpaRepository <turma, Integer>{
}

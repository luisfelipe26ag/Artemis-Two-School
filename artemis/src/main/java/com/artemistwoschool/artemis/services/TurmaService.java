package com.artemistwoschool.artemis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artemistwoschool.artemis.Repositories.TurmaRepository;
import com.artemistwoschool.artemis.models.turma;


@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public Long contarTurma(){
        return turmaRepository.count();
    }

    public turma buscarTurma(Integer id){
        return turmaRepository.findById(id).get();
    }

    public List<turma> listarTurmas(){
        return turmaRepository.findAll();
    }

    public Boolean deletarTurma(Integer id){
        if(turmaRepository.existsById(id)){
            turmaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public turma cadastrarUsuario(turma turma ){
        return turmaRepository.save(turma);
    }

    public turma atualizarTurma(Integer id, turma turma){
        turma turmaRecuperado = buscarTurma(id);
        if (turmaRecuperado != null) {
            turmaRecuperado.setId(id);
            if (turma.getNome()!= null) {
                turmaRecuperado.setNome(turma.getNome());
            }
            
            return turmaRepository.save(turmaRecuperado);
        }
        return null;
    }

    
}
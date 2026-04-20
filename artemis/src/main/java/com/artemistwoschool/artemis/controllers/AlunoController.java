package com.artemistwoschool.artemis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artemistwoschool.artemis.models.Aluno;
import com.artemistwoschool.artemis.services.AlunoService;

@RestController
@RequestMapping("/usuario")
public class AlunoController {
    
 @Autowired
    private AlunoService alunoService;
    
    @GetMapping("/contar-alunos")
    public Long contarAlunos(){
        return alunoService.contarUsuario();
    }

    @GetMapping("/buscar-aluno/{id}")   
    public Aluno buscarAluno(@PathVariable Integer id){
        return alunoService.buscarAluno(id);
    }

    @GetMapping("/listar-alunos")
    public List<Aluno> listarAlunos(){
        return alunoService.listarUsuarios();
    }

    @DeleteMapping("/deletar-aluno/{id}")
    public String deletarAluno(@PathVariable Integer id){
        if (alunoService.deletarAluno(id)) {
            return "Aluno deletado com sucesso";
        }
        return "Falha ao deletar o aluno";
    }

    @PostMapping("/salvar-aluno")
    public Aluno cadastrarAluno(@RequestBody Aluno aluno){
        return alunoService.cadastrarAluno(aluno);
    }

    @PutMapping("/atualizar-aluno/{id}")
    public String atualizarAluno(
        @PathVariable Integer id, 
        @RequestBody Aluno aluno
    ){
        if (alunoService.atualizarAluno(id, aluno)!=null) {
            return "Aluno atualizado com sucesso";
        }
        return "Falha ao atualizar o aluno";
        }
    }

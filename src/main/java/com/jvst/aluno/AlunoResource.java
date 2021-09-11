package com.jvst.aluno;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alunos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AlunoResource {
    
    @Inject
    private AlunoService alunoService;

    @GET
    public List<Aluno> listarAlunos(){
        return alunoService.listarAlunos();
    }

    @POST
    public List<Aluno> adicionarAluno(Aluno aluno){
        alunoService.adicionarAluno(aluno);
        return listarAlunos();
    }
}

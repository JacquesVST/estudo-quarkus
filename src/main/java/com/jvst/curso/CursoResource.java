package com.jvst.curso;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cursos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CursoResource {
    
    @Inject
    private CursoService cursoService;

    @GET
    public List<Curso> listarCursos(){
        return cursoService.listarCursos();
    }

    @POST
    public List<Curso> adicionarCurso(Curso curso){
        cursoService.adicionarCurso(curso);
        return listarCursos();
    }
}

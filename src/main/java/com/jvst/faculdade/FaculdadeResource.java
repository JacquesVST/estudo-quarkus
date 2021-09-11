package com.jvst.faculdade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/faculdades")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FaculdadeResource {
    
    @Inject
    private FaculdadeService faculdadeService;

    @GET
    public List<Faculdade> listarFaculdades(){
        return faculdadeService.listarFaculdades();
    }

    @POST
    public List<Faculdade> adicionarFaculdade(Faculdade faculdade){
        faculdadeService.adicionarFaculdade(faculdade);
        return listarFaculdades();
    }
}

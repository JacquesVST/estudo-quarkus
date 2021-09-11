package com.jvst.curso;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.jvst.util.MongoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@ApplicationScoped
public class CursoService {

    @Inject
    private MongoDAO mongoDAO;

    public List<Curso> listarCursos() {
        List<Curso> cursos = new ArrayList<>();
        MongoCursor<Curso> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                cursos.add(cursor.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
        }

        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        getCollection().insertOne(curso);
    }

    public MongoCollection<Curso> getCollection() {
        return mongoDAO.getDatabase().getCollection("curso", Curso.class);
    }

}
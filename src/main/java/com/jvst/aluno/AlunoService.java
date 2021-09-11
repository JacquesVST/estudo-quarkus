package com.jvst.aluno;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.jvst.util.MongoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@ApplicationScoped
public class AlunoService {

    @Inject
    private MongoDAO mongoDAO;

    public List<Aluno> listarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        MongoCursor<Aluno> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                alunos.add(cursor.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
        }

        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        getCollection().insertOne(aluno);
    }

    public MongoCollection<Aluno> getCollection() {
        return mongoDAO.getDatabase().getCollection("aluno", Aluno.class);
    }

}
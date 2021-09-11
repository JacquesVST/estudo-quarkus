package com.jvst.faculdade;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.jvst.util.MongoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@ApplicationScoped
public class FaculdadeService {

    @Inject
    private MongoDAO mongoDAO;

    public List<Faculdade> listarFaculdades() {
        List<Faculdade> faculdades = new ArrayList<>();
        MongoCursor<Faculdade> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                faculdades.add(cursor.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
        }

        return faculdades;
    }

    public void adicionarFaculdade(Faculdade faculdade) {
        getCollection().insertOne(faculdade);
    }

    public MongoCollection<Faculdade> getCollection() {
        return mongoDAO.getDatabase().getCollection("faculdade", Faculdade.class);
    }

}

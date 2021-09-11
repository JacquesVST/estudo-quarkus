package com.jvst.util;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

@ApplicationScoped
public class MongoDAO {

    @Inject
    private MongoClient mongoClient;

    public MongoDatabase getDatabase() {
        return mongoClient.getDatabase("workshop");
    }
    
}

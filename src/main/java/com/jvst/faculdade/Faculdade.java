package com.jvst.faculdade;

import java.util.Objects;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Faculdade {

    @BsonProperty("_id")
    @BsonId
    private ObjectId id;
    private String nome;
    private String cidade;

    public Faculdade() {
    }

    public Faculdade(ObjectId id, String nome, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }

    public ObjectId getId() {
        return this.id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Faculdade id(ObjectId id) {
        setId(id);
        return this;
    }

    public Faculdade nome(String nome) {
        setNome(nome);
        return this;
    }

    public Faculdade cidade(String cidade) {
        setCidade(cidade);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Faculdade)) {
            return false;
        }
        Faculdade faculdade = (Faculdade) o;
        return Objects.equals(id, faculdade.id) && Objects.equals(nome, faculdade.nome)
                && Objects.equals(cidade, faculdade.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cidade);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nome='" + getNome() + "'" + ", cidade='" + getCidade() + "'" + "}";
    }

}

package com.jvst.curso;

import java.util.Objects;

import com.jvst.faculdade.Faculdade;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Curso {

    @BsonProperty("_id")
    @BsonId
    private ObjectId id;
    private String descricao;
    private Float mensalidade;
    private Faculdade faculdade;

    public Curso() {
    }

    public Curso(ObjectId id, String descricao, Float mensalidade, Faculdade faculdade) {
        this.id = id;
        this.descricao = descricao;
        this.mensalidade = mensalidade;
        this.faculdade = faculdade;
    }

    public ObjectId getId() {
        return this.id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getMensalidade() {
        return this.mensalidade;
    }

    public void setMensalidade(Float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Faculdade getFaculdade() {
        return this.faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }

    public Curso id(ObjectId id) {
        setId(id);
        return this;
    }

    public Curso descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    public Curso mensalidade(Float mensalidade) {
        setMensalidade(mensalidade);
        return this;
    }

    public Curso faculdade(Faculdade faculdade) {
        setFaculdade(faculdade);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Curso)) {
            return false;
        }
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id) && Objects.equals(descricao, curso.descricao) && Objects.equals(mensalidade, curso.mensalidade) && Objects.equals(faculdade, curso.faculdade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, mensalidade, faculdade);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", mensalidade='" + getMensalidade() + "'" +
            ", faculdade='" + getFaculdade() + "'" +
            "}";
    }


}

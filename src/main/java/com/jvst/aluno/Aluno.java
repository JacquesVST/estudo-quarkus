package com.jvst.aluno;

import java.util.Objects;

import com.jvst.curso.Curso;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Aluno {

    @BsonProperty("_id")
    @BsonId
    private ObjectId id;
    private String nome;
    private String cpf;
    private Curso curso;

    public Aluno() {
    }

    public Aluno(ObjectId id, String nome, String cpf, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
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

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno id(ObjectId id) {
        setId(id);
        return this;
    }

    public Aluno nome(String nome) {
        setNome(nome);
        return this;
    }

    public Aluno cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    public Aluno curso(Curso curso) {
        setCurso(curso);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aluno)) {
            return false;
        }
        Aluno aluno = (Aluno) o;
        return Objects.equals(id, aluno.id) && Objects.equals(nome, aluno.nome) && Objects.equals(cpf, aluno.cpf)
                && Objects.equals(curso, aluno.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, curso);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nome='" + getNome() + "'" + ", cpf='" + getCpf() + "'" + ", curso='"
                + getCurso() + "'" + "}";
    }

}

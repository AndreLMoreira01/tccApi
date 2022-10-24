package br.com.andre.tcc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="historia")
public class Historia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHistoria;

    private String nomehistoria;

    private String autor;

    private String descricao;

    private String conteudo;

    private String tipo;

    private String imagem;

    @ManyToOne
    @JoinColumn(name = "conquista_id")
    private Conquista conquista;

    public Conquista getConquista() {
        return conquista;
    }

    public void setConquista(Conquista conquista) {
        this.conquista = conquista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Historia historia = (Historia) o;
        return idHistoria == historia.idHistoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHistoria);
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public long getId_historia() {
        return idHistoria;
    }

    public void setId_historia(long id_historia) {
        this.idHistoria = id_historia;
    }

    public String getNomehistoria() {
        return nomehistoria;
    }

    public void setNomehistoria(String nomehistoria) {
        this.nomehistoria = nomehistoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

package br.com.andre.tcc.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_jogo;

    private String nome;

    private String descricao;

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
        Jogo jogo = (Jogo) o;
        return id_jogo == jogo.id_jogo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_jogo);
    }

    public long getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(long id_jogo) {
        this.id_jogo = id_jogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

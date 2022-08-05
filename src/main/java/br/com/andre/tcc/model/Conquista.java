package br.com.andre.tcc.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="conquista")

public class Conquista {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private String descricao;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conquista conquista = (Conquista) o;
        return id == conquista.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

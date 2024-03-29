package br.com.andre.tcc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="conquista")
public class Conquista {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_conquista;

    private String nomeconquista;

    private String descricao;

    @JsonIgnore
    @OneToMany(mappedBy = "conquista")
    private List<Historia> historias = new ArrayList<>();

    public List<Historia> getHistorias() {
        return historias;
    }

    public void setHistorias(List<Historia> historias) {
        this.historias = historias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conquista conquista = (Conquista) o;
        return id_conquista == conquista.id_conquista;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_conquista);
    }

    public long getId_conquista() {
        return id_conquista;
    }

    public void setId_conquista(Long id_conquista) {
        this.id_conquista = id_conquista;
    }

    public String getNomeconquista() {
        return nomeconquista;
    }

    public void setNomeconquista(String nomeconquista) {
        this.nomeconquista = nomeconquista;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}

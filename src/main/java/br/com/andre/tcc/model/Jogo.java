package br.com.andre.tcc.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_jogo;

    private String nomejogo;

    private String descricao;

    private String imagem;

    private String rota;

    private String conquistad;

    public String getConquistad() {
        return conquistad;
    }

    public void setConquistad(String conquistad) {
        this.conquistad = conquistad;
    }

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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public long getId_jogo() {
        return id_jogo;
    }

    public void setId_jogo(Long id_jogo) {
        this.id_jogo = id_jogo;
    }

    public String getNomejogo() {
        return nomejogo;
    }

    public void setNomejogo(String nomejogo) {
        this.nomejogo = nomejogo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
}


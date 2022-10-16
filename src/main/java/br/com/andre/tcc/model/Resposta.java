package br.com.andre.tcc.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="resposta")
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_resposta;

    private String resposta;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resposta resposta = (Resposta) o;
        return id_resposta == resposta.id_resposta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_resposta);
    }

    public long getId_resposta() {
        return id_resposta;
    }

    public void setId_resposta(long id_resposta) {
        this.id_resposta = id_resposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}

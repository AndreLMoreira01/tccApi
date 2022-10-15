package br.com.andre.tcc.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="alternativa")
public class Alternativa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_alternativa;

    private String a1;

    private String a2;

    private String a3;

    private String a4;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alternativa that = (Alternativa) o;
        return id_alternativa == that.id_alternativa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_alternativa);
    }

    public long getId_alternativa() {
        return id_alternativa;
    }

    public void setId_alternativa(long id_alternativa) {
        this.id_alternativa = id_alternativa;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }
}

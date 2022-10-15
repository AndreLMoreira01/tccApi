package br.com.andre.tcc.model;

import javax.persistence.*;

@Entity
@Table(name="resposta")
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_resposta;

    private String resposta;
}

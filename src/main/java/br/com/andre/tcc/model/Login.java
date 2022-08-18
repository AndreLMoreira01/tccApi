package br.com.andre.tcc.model;

import javax.persistence.*;

@Entity
@Table(name="login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

}

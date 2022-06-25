package br.com.andre.tcc.repository;


import br.com.andre.tcc.model.Jogo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository  extends JpaRepository<Jogo, Integer> {
}

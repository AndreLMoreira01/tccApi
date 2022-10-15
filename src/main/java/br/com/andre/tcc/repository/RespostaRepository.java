package br.com.andre.tcc.repository;

import br.com.andre.tcc.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository <Resposta, Long> {
}

package br.com.andre.tcc.repository;

import br.com.andre.tcc.model.Conquista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  QuizRepository extends JpaRepository<Conquista, Long> {
}

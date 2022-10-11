package br.com.andre.tcc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativaRepository extends JpaRepository<PerguntaRepository, Long> {
}

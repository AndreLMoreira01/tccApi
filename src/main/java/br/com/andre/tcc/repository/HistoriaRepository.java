package br.com.andre.tcc.repository;

import br.com.andre.tcc.model.Historia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaRepository extends JpaRepository<Historia, Long> {
}

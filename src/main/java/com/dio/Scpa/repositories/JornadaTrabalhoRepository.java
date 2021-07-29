package com.dio.Scpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.Scpa.models.JornadaTrabalho;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {

}

package com.dio.Scpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.Scpa.models.Localidade;

@Repository
public interface LocalidadeRepository extends JpaRepository<Localidade, Long> {

}

package com.dio.Scpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.Scpa.models.Calendario;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

}

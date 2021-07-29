package com.dio.Scpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.Scpa.models.BancoHoras;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {

}

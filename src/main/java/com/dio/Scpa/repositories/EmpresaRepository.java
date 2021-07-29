package com.dio.Scpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.Scpa.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}

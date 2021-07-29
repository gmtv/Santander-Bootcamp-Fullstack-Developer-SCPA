package com.dio.Scpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.Scpa.models.NivelAcesso;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {

}

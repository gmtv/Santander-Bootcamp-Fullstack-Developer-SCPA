package com.dio.Scpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.Scpa.models.TipoData;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {

}

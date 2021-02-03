package com.ceteq.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceteq.sistema.model.ProcesoModel;

@Repository
public interface ProcesoRepository extends JpaRepository<ProcesoModel, Integer> {

}

package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{
	

}

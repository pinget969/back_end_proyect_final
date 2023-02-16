package com.portfolio.api.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.api.entity.AcademicTraining;
 
public interface AcademicTrainingRepository extends JpaRepository<AcademicTraining, Long> {	
	 public List<AcademicTraining> findAll();

}

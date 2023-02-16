package com.portfolio.api.service;

import java.util.List;

import com.portfolio.api.entity.AcademicTraining;


public interface AcademicTrainingService {
	public List<AcademicTraining> findAllAcademicTraining();
	public AcademicTraining findByIdAcademicTraining(Long id);
	public void deleteAcademicTraining(Long id); 
	public void saveAcademicTraining(AcademicTraining academicTraining);
	public AcademicTraining updateAcademicTraining (Long id, AcademicTraining academicTraining);
}		  

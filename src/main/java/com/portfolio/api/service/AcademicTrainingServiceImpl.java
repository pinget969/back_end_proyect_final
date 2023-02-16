package com.portfolio.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.api.entity.AcademicTraining;
import com.portfolio.api.repository.AcademicTrainingRepository;

@Service
public class AcademicTrainingServiceImpl implements AcademicTrainingService {
	
	@Autowired
	AcademicTrainingRepository academicTrainingRepository;

	@Override
	public List<AcademicTraining> findAllAcademicTraining() {
			List<AcademicTraining> academicTraining = academicTrainingRepository.findAll();
		return academicTraining;
	}

	@Override
	public AcademicTraining findByIdAcademicTraining(Long id) {
		AcademicTraining academicTraining = academicTrainingRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID de la educación académica"));
		return academicTraining;
	}

	@Override
	public void deleteAcademicTraining(Long id) {
		 academicTrainingRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID de la educación académica"));
	     academicTrainingRepository.deleteById(id);
	     
	}

	@Override
	public void saveAcademicTraining(AcademicTraining academicTraining) {
		academicTrainingRepository.save(academicTraining);
	}

	@Override
	public AcademicTraining updateAcademicTraining(Long id, AcademicTraining academicTrainingModified) {
		AcademicTraining academicTraining = academicTrainingRepository.findById(id).orElseThrow(()->new NullPointerException("No se encontró el ID de la educación académica"));
		academicTraining.setNameTitleTraining(academicTrainingModified.getNameTitleTraining());
		academicTraining.setImgTrainingAcademic(academicTrainingModified.getImgTrainingAcademic());
		academicTraining.setNameInstitutionAcademic(academicTrainingModified.getNameInstitutionAcademic());
		academicTraining.setConditionState(academicTrainingModified.getConditionState());
		return academicTrainingRepository.save(academicTraining);
	}
	
}

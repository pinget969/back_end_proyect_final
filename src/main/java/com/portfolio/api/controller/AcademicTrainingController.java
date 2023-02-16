package com.portfolio.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.api.entity.AcademicTraining;
import com.portfolio.api.service.AcademicTrainingService;

@CrossOrigin(origins = "https://nelson-pinget.web.app", maxAge = 3600)
@RestController
@RequestMapping("/api/academic")
public class AcademicTrainingController {
	@Autowired
	AcademicTrainingService academicTrainingService;
	
	@PostMapping
	public ResponseEntity<?> createAcademicTraining(@RequestBody AcademicTraining academicTraining){
		Map<String, Object> response = new HashMap<>();
		try {
			academicTrainingService.saveAcademicTraining(academicTraining);
			response.put("mensaje", "la educación académica fue creada exitosamente");
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("mensaje", "Error al crear la educación académica");
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
	}
	
	@GetMapping("/find/id/{id}")
	public ResponseEntity<Map<String, Object>> findByIdAcademicTraining(@PathVariable Long id){
		Map<String, Object> response = new HashMap<>();
		try {
			 AcademicTraining academicTraining = academicTrainingService.findByIdAcademicTraining(id);
			response.put("mensaje", academicTraining);
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("mensaje", "Error al buscar la educación académica");
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
	}
	@GetMapping
	public ResponseEntity<Map<String, Object>>findAllAcademicTraining(){
		Map<String, Object> response = new HashMap<>();
		try {
			response.put("mensaje", academicTrainingService.findAllAcademicTraining());
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("mensaje", "Error al buscar todas las educaciones académicas");
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
	}
	@PutMapping("/id/{id}")
	public ResponseEntity<?> updateAcademicTraining(@RequestBody AcademicTraining academicTrainingModified, @PathVariable(value = "id") Long idAcademic){
		Map<String, Object> response = new HashMap<>();
		try {
			response.put("academia educativa", academicTrainingService.updateAcademicTraining(idAcademic, academicTrainingModified));
			return ResponseEntity.ok(response);
		}
		catch(Exception e) {
			response.put("Error al editar la academia educativa", e.getMessage());
			return ResponseEntity.badRequest().body(response); 
		}
	}
	@DeleteMapping("/delete")
	public ResponseEntity<Map<String, Object>> deleteByIdAcademicTraining(@PathVariable Long id){
		Map<String, Object> response = new HashMap<>();
		try {
			AcademicTraining academicTraining = academicTrainingService.findByIdAcademicTraining(id);
			response.put("academia educativa eliminada", academicTraining);
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("message", "Error al eliminar la academia educativa.");
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}	
	}


	


}

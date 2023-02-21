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
import com.portfolio.api.entity.ContactDeveloper;
import com.portfolio.api.service.ContactDeveloperService;

@CrossOrigin(origins = "https://nelson-pinget.web.app", maxAge = 3600)
@RestController
@RequestMapping("/api/contact")
public class ContactDeveloperController {
	@Autowired
	ContactDeveloperService contactDeveloperService;
	
	@GetMapping
	public ResponseEntity<Map<String, Object>>findAllContacDeveloper(){
		Map<String, Object> response = new HashMap<>();
		try {
			response.put("mensaje", contactDeveloperService.findAllContactDeveloper());
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("mensaje", "Error al buscar los contactos");
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
	}
	@PostMapping
	public ResponseEntity<Map<String, Object>>createContacDeveloper(@RequestBody ContactDeveloper contactDeveloper){
		Map<String, Object> response = new HashMap<>();
		try {
			contactDeveloperService.saveContactDeveloper(contactDeveloper);
			response.put("mensaje", "el contacto fue creado adecuadamente");
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("mensaje", "Error al crear el contacto");
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
		
	}
	@GetMapping("/find/id/{id}")
	public ResponseEntity<Map<String, Object>>finByIdContacDeveloper(@PathVariable Long id){
		Map<String, Object> response = new HashMap<>();
		try {
			ContactDeveloper contactDeveloper = contactDeveloperService.findByIdContactDeveloper(id);
			response.put("mensaje", contactDeveloper);
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("mensaje", "Error al buscar el contacto");
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}
		
	}
	@PutMapping("/id/{id}")
	public ResponseEntity<Map<String, Object>>updateContacDeveloper(@RequestBody ContactDeveloper contactDeveloperModified, @PathVariable(value ="id") Long idContac){
		Map<String, Object> response = new HashMap<>();
		try {
			response.put("contact developer", contactDeveloperService.updateContactDeveloper(idContac, contactDeveloperModified));
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("Error al editar el contacto", e.getMessage());
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}	
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Map<String, Object>> deleteByIdContact(@PathVariable Long id){
		Map<String, Object> response = new HashMap<>();
		try {
			contactDeveloperService.deleteByIdContactDeveloper(id);
			response.put("mensaje", "contacto eliminado");
			return ResponseEntity.ok(response);
		}
		catch( Exception e) {
			response.put("message", "error al eliminar el contacto.");
			response.put("Error", e.getMessage());
			return ResponseEntity.badRequest().body(response);
		}	
	}
}

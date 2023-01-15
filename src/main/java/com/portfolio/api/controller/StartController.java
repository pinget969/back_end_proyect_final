package com.portfolio.api.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://nelson-pinget.web.app", maxAge = 3600)
@RestController
@RequestMapping("/")
public class StartController {

	@GetMapping
	public ResponseEntity<?> read(@PathVariable Long id){
		return ResponseEntity.ok("Bienvenido a la api rest realizada para Argentina Programa! Para ver la aplicación completa ingrese en: https://nelson-pinget.web.app");
	}
}
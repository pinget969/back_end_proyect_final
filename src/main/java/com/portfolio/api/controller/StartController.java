package com.portfolio.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://nelson-pinget.web.app", maxAge = 3600)
@RestController
public class StartController {

	@GetMapping("/")
	public String start(@PathVariable Long id){
		return "Bienvenido a la API Rest realizada para Argentina Programa! Para ver la aplicación completa ingrese en: https://nelson-pinget.web.app";
	}
}
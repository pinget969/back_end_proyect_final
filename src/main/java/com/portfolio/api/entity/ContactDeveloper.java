package com.portfolio.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class ContactDeveloper {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@NotBlank
	private String nameDeveloper;
	@NotNull
	@NotBlank
	private String perfiDeveloper;
	@NotNull
	private String LocationDeveloper;
	@NotNull
	@NotBlank
	@Email
	private String EmailDeveloper;
	private String webSiteDeveloper;
	@NotNull
	@NotBlank
	private String gitHubDeveloper;
	@NotNull
	@NotBlank
	private String linkedinDevelper;

}

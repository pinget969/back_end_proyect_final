package com.portfolio.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "academic")

public class AcademicTraining implements Serializable {
		private static final long serialVersionUID = -3842439347817019213L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(length = 50)
		private String nameTitleTraining;
		@Column
		private String imgTrainingAcademic;
		@Column
		private String nameInstitutionAcademic;
		@Column
		private String conditionState;

}

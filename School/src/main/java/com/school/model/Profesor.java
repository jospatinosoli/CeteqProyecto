package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Profesor")
public class Profesor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idProfesor;
	
	@Column (name = "nombre_profesor", nullable = false, length = 80)
	private String nombreProfesor;
	
	@Column (name = "apellido_paterno_profesor", nullable = false, length = 80)
	private String appProfesor;
	
	@Column (name = "apellido_materno_profesor", nullable = false, length = 80)
	private String apmProfesor;

	public Profesor() {
	}

	public Profesor(Integer id) {
		this.idProfesor = id;
	}

	public Integer getId() {
		return idProfesor;
	}

	public void setId(Integer id) {
		this.idProfesor = id;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public String getAppProfesor() {
		return appProfesor;
	}

	public void setAppProfesor(String appProfesor) {
		this.appProfesor = appProfesor;
	}

	public String getApmProfesor() {
		return apmProfesor;
	}

	public void setApmProfesor(String apmProfesor) {
		this.apmProfesor = apmProfesor;
	}
	
	
	
	
	

}
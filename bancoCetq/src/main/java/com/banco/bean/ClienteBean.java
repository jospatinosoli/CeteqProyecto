package com.banco.bean;

import com.banco.model.CreditoModel;
import com.banco.model.DebitoModel;

public class ClienteBean {

private Integer idCliente;
	

	private String nombreCliente;
	

	private String apPaterno;
	

	private String apMaterno;
	

	private Integer edad;
	

	private String email;
	
	
	private Integer creditoModel;
	
	private Integer debitoModel;
	
	
	



	

	public Integer getCreditoModel() {
		return creditoModel;
	}

	public void setCreditoModel(Integer creditoModel) {
		this.creditoModel = creditoModel;
	}

	public Integer getDebitoModel() {
		return debitoModel;
	}

	public void setDebitoModel(Integer debitoModel) {
		this.debitoModel = debitoModel;
	}

	public ClienteBean() {
	}

	public ClienteBean(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
}

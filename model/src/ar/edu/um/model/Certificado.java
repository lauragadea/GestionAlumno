package ar.edu.um.model;

import java.math.BigDecimal;

public class Certificado {
	private String facultad;
	private String carrera;
	private String nombre;
	private String apellido;
	private BigDecimal DNI;
	private int anhoCursado;
	
	public Certificado(){
		
	}
	
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public BigDecimal getDNI() {
		return DNI;
	}
	public void setDNI(BigDecimal DNI) {
		this.DNI = DNI;
	}
	public int getAñoCursado() {
		return anhoCursado;
	}
	public void setAnhoCursado(int anhoCursado) {
		this.anhoCursado = anhoCursado;
	}

	@Override
	public String toString() {
		return "Certificado [facultad=" + facultad + ", carrera=" + carrera
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", DNI="
				+ DNI + ", anhoCursado=" + anhoCursado + "]";
	}


	
	 
	
}

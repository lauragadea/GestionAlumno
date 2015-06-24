package ar.edu.um.model;

import java.util.Date;

public class RespuestaJSON {
	
	private String carrera;
	private int plan;
	private int anio;
	private int codigo;
	private String materia;
	private Date fecha;
	private int nota;
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "RespuestaJSON [carrera=" + carrera + ", plan=" + plan
				+ ", anio=" + anio + ", codigo=" + codigo + ", materia="
				+ materia + ", fecha=" + fecha + ", nota=" + nota + "]";
	}
	
	
	

}

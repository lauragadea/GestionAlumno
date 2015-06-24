package ar.edu.um.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carrera")
public class Carrera implements Serializable{
	@Id
	@Column(name = "IDFacultad", nullable = false)
	private int IDFacultad;
	@Id
	@Column(name = "IDPlan", nullable = false)
	private int IDPlan;
	@Id
	@Column(name = "IDCarrera", nullable = false)
	private int IDCarrera;
	@Column(name = "Nombre", nullable = false)
	private String Nombre;
	@Column(name = "iniciales", nullable = false)
	private String iniciales;
	@Column(name = "Titulo", nullable = false)
	private String Titulo;
	@Column(name = "Car_Trabajo_Final", nullable = false)
	private int Car_Trabajo_Final;
	@Column(name = "Car_Resolucion", nullable = false)
	private String Car_Resolucion;
	@Column(name = "Car_Chequera", nullable = false)
	private int Car_Chequera;
	@Column(name = "Car_CheqUnica", nullable = false)
	private int Car_CheqUnica;
	@Column(name = "Car_Blo_ID", nullable = false)
	private int Car_Blo_ID;
	@Column(name = "Car_OptObligatorias", nullable = false)
	private int Car_OptObligatorias;
	@Column(name = "clave", nullable = false)
	private int clave;
	
	
	public int getIDFacultad() {
		return IDFacultad;
	}
	public void setIDFacultad(int iDFacultad) {
		IDFacultad = iDFacultad;
	}
	public int getIDPlan() {
		return IDPlan;
	}
	public void setIDPlan(int iDPlan) {
		IDPlan = iDPlan;
	}
	public int getIDCarrera() {
		return IDCarrera;
	}
	public void setIDCarrera(int iDCarrera) {
		IDCarrera = iDCarrera;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getIniciales() {
		return iniciales;
	}
	public void setIniciales(String iniciales) {
		this.iniciales = iniciales;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public int getCar_Trabajo_Final() {
		return Car_Trabajo_Final;
	}
	public void setCar_Trabajo_Final(int car_Trabajo_Final) {
		Car_Trabajo_Final = car_Trabajo_Final;
	}
	public String getCar_Resolucion() {
		return Car_Resolucion;
	}
	public void setCar_Resolucion(String car_Resolucion) {
		Car_Resolucion = car_Resolucion;
	}
	public int getCar_Chequera() {
		return Car_Chequera;
	}
	public void setCar_Chequera(int car_Chequera) {
		Car_Chequera = car_Chequera;
	}
	public int getCar_CheqUnica() {
		return Car_CheqUnica;
	}
	public void setCar_CheqUnica(int car_CheqUnica) {
		Car_CheqUnica = car_CheqUnica;
	}
	public int getCar_Blo_ID() {
		return Car_Blo_ID;
	}
	public void setCar_Blo_ID(int car_Blo_ID) {
		Car_Blo_ID = car_Blo_ID;
	}
	public int getCar_OptObligatorias() {
		return Car_OptObligatorias;
	}
	public void setCar_OptObligatorias(int car_OptObligatorias) {
		Car_OptObligatorias = car_OptObligatorias;
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	@Override
	public String toString() {
		return "Carrera [IDFacultad=" + IDFacultad + ", IDPlan=" + IDPlan
				+ ", IDCarrera=" + IDCarrera + ", Nombre=" + Nombre
				+ ", iniciales=" + iniciales + ", Titulo=" + Titulo
				+ ", Car_Trabajo_Final=" + Car_Trabajo_Final
				+ ", Car_Resolucion=" + Car_Resolucion + ", Car_Chequera="
				+ Car_Chequera + ", Car_CheqUnica=" + Car_CheqUnica
				+ ", Car_Blo_ID=" + Car_Blo_ID + ", Car_OptObligatorias="
				+ Car_OptObligatorias + ", clave=" + clave + "]";
	}
	
	
}

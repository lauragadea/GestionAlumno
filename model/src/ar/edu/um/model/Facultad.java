package ar.edu.um.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "facultad")
public class Facultad {
	@Id
	@Column(name = "IDFacultad", nullable = false)
	private int IDFacultad;
	@Column(name = "Fac_Nombre", nullable = false)
	private String Fac_Nombre;
	@Column(name = "Fac_Acron", nullable = false)
	private String Fac_Acron;
	public int getIDFacultad() {
		return IDFacultad;
	}
	public void setIDFacultad(int iDFacultad) {
		IDFacultad = iDFacultad;
	}
	public String getFac_Nombre() {
		return Fac_Nombre;
	}
	public void setFac_Nombre(String fac_Nombre) {
		Fac_Nombre = fac_Nombre;
	}
	public String getFac_Acron() {
		return Fac_Acron;
	}
	public void setFac_Acron(String fac_Acron) {
		Fac_Acron = fac_Acron;
	}
	@Override
	public String toString() {
		return "Facultad [IDFacultad=" + IDFacultad + ", Fac_Nombre="
				+ Fac_Nombre + ", Fac_Acron=" + Fac_Acron + "]";
	}
	
	

}

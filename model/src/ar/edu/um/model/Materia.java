package ar.edu.um.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	@Id
	@Column(name = "IDFacultad", nullable = false)
	private int IDFacultad;
	@Id
	@Column(name = "IDPlan", nullable = false)
	private int IDPlan;
	@Id
	@Column(name = "IDMateria", nullable = false)
	private int IDMateria;
	@Column(name = "Mat_Ctd_ID", nullable = false)
	private int Mat_Ctd_ID;
	@Column(name = "Nombre", nullable = false)
	private String Nombre;
	@Column(name = "Mat_Opcional", nullable = false)
	private int Mat_Opcional;
	@Column(name = "Mat_Virtual", nullable = false)
	private int Mat_Virtual;
	@Column(name = "Mat_Dias", nullable = false)
	private int Mat_Dias;
	@Column(name = "Mat_Per_ID", nullable = false)
	private int Mat_Per_ID;
	@Column(name = "Mat_Especial", nullable = false)
	private int Mat_Taller;
	@Column(name = "Mat_ID_Real", nullable = false)
	private String Mat_ID_Real;
	@Column(name = "Mat_Curso", nullable = false)
	private int Mat_Curso;
	@Column(name = "ID", nullable = false)
	private int ID;
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
	public int getIDMateria() {
		return IDMateria;
	}
	public void setIDMateria(int iDMateria) {
		IDMateria = iDMateria;
	}
	public int getMat_Ctd_ID() {
		return Mat_Ctd_ID;
	}
	public void setMat_Ctd_ID(int mat_Ctd_ID) {
		Mat_Ctd_ID = mat_Ctd_ID;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getMat_Opcional() {
		return Mat_Opcional;
	}
	public void setMat_Opcional(int mat_Opcional) {
		Mat_Opcional = mat_Opcional;
	}
	public int getMat_Virtual() {
		return Mat_Virtual;
	}
	public void setMat_Virtual(int mat_Virtual) {
		Mat_Virtual = mat_Virtual;
	}
	public int getMat_Dias() {
		return Mat_Dias;
	}
	public void setMat_Dias(int mat_Dias) {
		Mat_Dias = mat_Dias;
	}
	public int getMat_Per_ID() {
		return Mat_Per_ID;
	}
	public void setMat_Per_ID(int mat_Per_ID) {
		Mat_Per_ID = mat_Per_ID;
	}
	public int getMat_Taller() {
		return Mat_Taller;
	}
	public void setMat_Taller(int mat_Taller) {
		Mat_Taller = mat_Taller;
	}
	public String getMat_ID_Real() {
		return Mat_ID_Real;
	}
	public void setMat_ID_Real(String mat_ID_Real) {
		Mat_ID_Real = mat_ID_Real;
	}
	public int getMat_Curso() {
		return Mat_Curso;
	}
	public void setMat_Curso(int mat_Curso) {
		Mat_Curso = mat_Curso;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Materia [IDFacultad=" + IDFacultad + ", IDPlan=" + IDPlan
				+ ", IDMateria=" + IDMateria + ", Mat_Ctd_ID=" + Mat_Ctd_ID
				+ ", Nombre=" + Nombre + ", Mat_Opcional=" + Mat_Opcional
				+ ", Mat_Virtual=" + Mat_Virtual + ", Mat_Dias=" + Mat_Dias
				+ ", Mat_Per_ID=" + Mat_Per_ID + ", Mat_Taller=" + Mat_Taller
				+ ", Mat_ID_Real=" + Mat_ID_Real + ", Mat_Curso=" + Mat_Curso
				+ ", ID=" + ID + "]";
	}
	
	
}

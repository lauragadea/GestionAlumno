package ar.edu.um.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {
	@Id
	@Column(name = "IDDocumento", nullable = false)
	private BigDecimal IDDocumento;
	@Id
	@Column(name = "IDTipoDoc", nullable = false)
	private int IDTipoDoc;
	@Column(name = "Apellido", nullable = false)
	private String Apellido;
	@Column(name = "Nombre", nullable = false)
	private String Nombre;
	@Column(name = "Sexo", nullable = false)
	private String Sexo;
	@Column(name = "Per_Pro_ID", nullable = false)
	private int Per_Pro_ID;
	@Column(name = "Per_Mascara", nullable = false)
	private String Per_Mascara;
	@Column(name = "id", nullable = false)
	private int id;
	

	public Persona() {

	}


	public BigDecimal getIDDocumento() {
		return IDDocumento;
	}


	public void setIDDocumento(BigDecimal iDDocumento) {
		IDDocumento = iDDocumento;
	}


	public int getIDTipoDoc() {
		return IDTipoDoc;
	}


	public void setIDTipoDoc(int iDTipoDoc) {
		IDTipoDoc = iDTipoDoc;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getSexo() {
		return Sexo;
	}


	public void setSexo(String sexo) {
		Sexo = sexo;
	}


	public int getPer_Pro_ID() {
		return Per_Pro_ID;
	}


	public void setPer_Pro_ID(int per_Pro_ID) {
		Per_Pro_ID = per_Pro_ID;
	}


	public String getPer_Mascara() {
		return Per_Mascara;
	}


	public void setPer_Mascara(String per_Mascara) {
		Per_Mascara = per_Mascara;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Persona [IDDocumento=" + IDDocumento + ", IDTipoDoc="
				+ IDTipoDoc + ", Apellido=" + Apellido + ", Nombre=" + Nombre
				+ ", Sexo=" + Sexo + ", Per_Pro_ID=" + Per_Pro_ID
				+ ", Per_Mascara=" + Per_Mascara + ", id=" + id + "]";
	}
	
	
	
}
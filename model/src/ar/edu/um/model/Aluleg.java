package ar.edu.um.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluleg")
public class Aluleg implements Serializable{
	@Id
	@Column(name = "IDDocumento", nullable = false)
	private BigDecimal IDDOcumento;
	@Id
	@Column(name = "IDTipoDoc", nullable = false)
	private int IDTipoDoc;
	@Id
	@Column(name = "IDFacultad", nullable = false)
	private int IDFacultad;
	@Id
	@Column(name = "ALe_Geo_ID", nullable = false)
	private int ALe_Geo_ID;
	@Column(name = "IDLegajo", nullable = false)
	private int IDLegajo;
	@Column(name = "ALe_Lec_ID", nullable = false)
	private int ALe_Lec_ID;
	@Column(name = "ALe_Fecha", nullable = false)
	private Date ALe_Fecha;
	@Column(name = "ALe_Pla_ID", nullable = false)
	private int ALe_Pla_ID;
	@Column(name = "ALe_Car_ID", nullable = false)
	private int ALe_Car_ID;
	@Column(name = "ALe_MAE_ID", nullable = false)
	private int ALe_MAE_ID;
	@Column(name = "ALe_Clave", nullable = false)
	private String ALe_Clave;
	@Column(name = "ALe_Intercambio", nullable = false)
	private int ALe_Intercambio;
	@Column(name = "ALe_Chequera", nullable = false)
	private String ALe_Chequera;
	@Column(name = "key", nullable = true)
	private String key;
	@Column(name = "id", nullable = false)
	private int id;
	
	public Aluleg(){
		
	}

	public BigDecimal getIDDOcumento() {
		return IDDOcumento;
	}

	public void setIDDOcumento(BigDecimal iDDOcumento) {
		IDDOcumento = iDDOcumento;
	}

	public int getIDTipoDoc() {
		return IDTipoDoc;
	}

	public void setIDTipoDoc(int iDTipoDoc) {
		IDTipoDoc = iDTipoDoc;
	}

	public int getIDFacultad() {
		return IDFacultad;
	}

	public void setIDFacultad(int iDFacultad) {
		IDFacultad = iDFacultad;
	}

	public int getALe_Geo_ID() {
		return ALe_Geo_ID;
	}

	public void setALe_Geo_ID(int aLe_Geo_ID) {
		ALe_Geo_ID = aLe_Geo_ID;
	}

	public int getIDLegajo() {
		return IDLegajo;
	}

	public void setIDLegajo(int iDLegajo) {
		IDLegajo = iDLegajo;
	}

	public int getALe_Lec_ID() {
		return ALe_Lec_ID;
	}

	public void setALe_Lec_ID(int aLe_Lec_ID) {
		ALe_Lec_ID = aLe_Lec_ID;
	}

	public Date getALe_Fecha() {
		return ALe_Fecha;
	}

	public void setALe_Fecha(Date aLe_Fecha) {
		ALe_Fecha = aLe_Fecha;
	}

	public int getALe_Pla_ID() {
		return ALe_Pla_ID;
	}

	public void setALe_Pla_ID(int aLe_Pla_ID) {
		ALe_Pla_ID = aLe_Pla_ID;
	}

	public int getALe_Car_ID() {
		return ALe_Car_ID;
	}

	public void setALe_Car_ID(int aLe_Car_ID) {
		ALe_Car_ID = aLe_Car_ID;
	}

	public int getALe_MAE_ID() {
		return ALe_MAE_ID;
	}

	public void setALe_MAE_ID(int aLe_MAE_ID) {
		ALe_MAE_ID = aLe_MAE_ID;
	}

	public String getALe_Clave() {
		return ALe_Clave;
	}

	public void setALe_Clave(String aLe_Clave) {
		ALe_Clave = aLe_Clave;
	}

	public int getALe_Intercambio() {
		return ALe_Intercambio;
	}

	public void setALe_Intercambio(int aLe_Intercambio) {
		ALe_Intercambio = aLe_Intercambio;
	}

	public String getALe_Chequera() {
		return ALe_Chequera;
	}


	public void setALe_Chequera(String aLe_Chequera) {
		ALe_Chequera = aLe_Chequera;
	}


	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Aluleg [IDDOcumento=" + IDDOcumento + ", IDTipoDoc="
				+ IDTipoDoc + ", IDFacultad=" + IDFacultad + ", ALe_Geo_ID="
				+ ALe_Geo_ID + ", IDLegajo=" + IDLegajo + ", ALe_Lec_ID="
				+ ALe_Lec_ID + ", ALe_Fecha=" + ALe_Fecha + ", ALe_Pla_ID="
				+ ALe_Pla_ID + ", ALe_Car_ID=" + ALe_Car_ID + ", ALe_MAE_ID="
				+ ALe_MAE_ID + ", ALe_Clave=" + ALe_Clave
				+ ", ALe_Intercambio=" + ALe_Intercambio + ", ALe_Chequera="
				+ ALe_Chequera + ", key=" + key + ", id=" + id + "]";
	}
	
	
	
}
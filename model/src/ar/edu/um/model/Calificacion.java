package ar.edu.um.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calificacion")
public class Calificacion {
	@Id
	@Column(name = "IDDocumento", nullable = false)
	private BigDecimal IDDocumento;
	@Id
	@Column(name = "IDTipoDoc", nullable = false)
	private int IDTipoDoc;
	@Id
	@Column(name = "IDFacultad", nullable = false)
	private int IDFacultad;
	@Id
	@Column(name = "IDPlan", nullable = false)
	private int IDPlan;
	@Id
	@Column(name = "IDMateria", nullable = false)
	private String IDMateria;
	@Id
	@Column(name = "fecha", nullable = false)
	private Date fecha;
	@Column(name = "calif", nullable = false)
	private String calif;
	@Column(name = "libro", nullable = false)
	private String libro;
	@Column(name = "folio", nullable = false)
	private int folio;
	@Column(name = "Cal_Promociona", nullable = false)
	private int Cal_Promociona;
	@Column(name = "Cal_Equivalencia", nullable = false)
	private int Cal_Equivalencia;
	@Column(name = "Cal_Pase", nullable = false)
	private int Cal_Pase;
	@Column(name = "Cal_Geo_ID", nullable = false)
	private int Cal_Geo_ID;
	@Column(name = "Cal_Lec_ID_Rg", nullable = false)
	private int Cal_Lec_ID_Rg;
	@Column(name = "Cal_Lec_ID_Ex", nullable = false)
	private int Cal_Lec_ID_Ex;
	@Column(name = "Cal_Lla_ID_Ex", nullable = false)
	private int Cal_Lla_ID_Ex;
	@Column(name = "Cal_Calif_Esc", nullable = false)
	private String Cal_Calif_Esc;
	@Column(name = "id", nullable = false)
	private int id;
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
	public String getIDMateria() {
		return IDMateria;
	}
	public void setIDMateria(String iDMateria) {
		IDMateria = iDMateria;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getCalif() {
		return calif;
	}
	public void setCalif(String calif) {
		this.calif = calif;
	}
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public int getCal_Promociona() {
		return Cal_Promociona;
	}
	public void setCal_Promociona(int cal_Promociona) {
		Cal_Promociona = cal_Promociona;
	}
	public int getCal_Equivalencia() {
		return Cal_Equivalencia;
	}
	public void setCal_Equivalencia(int cal_Equivalencia) {
		Cal_Equivalencia = cal_Equivalencia;
	}
	public int getCal_Pase() {
		return Cal_Pase;
	}
	public void setCal_Pase(int cal_Pase) {
		Cal_Pase = cal_Pase;
	}
	public int getCal_Geo_ID() {
		return Cal_Geo_ID;
	}
	public void setCal_Geo_ID(int cal_Geo_ID) {
		Cal_Geo_ID = cal_Geo_ID;
	}
	public int getCal_Lec_ID_Rg() {
		return Cal_Lec_ID_Rg;
	}
	public void setCal_Lec_ID_Rg(int cal_Lec_ID_Rg) {
		Cal_Lec_ID_Rg = cal_Lec_ID_Rg;
	}
	public int getCal_Lec_ID_Ex() {
		return Cal_Lec_ID_Ex;
	}
	public void setCal_Lec_ID_Ex(int cal_Lec_ID_Ex) {
		Cal_Lec_ID_Ex = cal_Lec_ID_Ex;
	}
	public int getCal_Lla_ID_Ex() {
		return Cal_Lla_ID_Ex;
	}
	public void setCal_Lla_ID_Ex(int cal_Lla_ID_Ex) {
		Cal_Lla_ID_Ex = cal_Lla_ID_Ex;
	}
	public String getCal_Calif_Esc() {
		return Cal_Calif_Esc;
	}
	public void setCal_Calif_Esc(String cal_Calif_Esc) {
		Cal_Calif_Esc = cal_Calif_Esc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Calificacion [IDDocumento=" + IDDocumento + ", IDTipoDoc="
				+ IDTipoDoc + ", IDFacultad=" + IDFacultad + ", IDPlan="
				+ IDPlan + ", IDMateria=" + IDMateria + ", fecha=" + fecha
				+ ", calif=" + calif + ", libro=" + libro + ", folio=" + folio
				+ ", Cal_Promociona=" + Cal_Promociona + ", Cal_Equivalencia="
				+ Cal_Equivalencia + ", Cal_Pase=" + Cal_Pase + ", Cal_Geo_ID="
				+ Cal_Geo_ID + ", Cal_Lec_ID_Rg=" + Cal_Lec_ID_Rg
				+ ", Cal_Lec_ID_Ex=" + Cal_Lec_ID_Ex + ", Cal_Lla_ID_Ex="
				+ Cal_Lla_ID_Ex + ", Cal_Calif_Esc=" + Cal_Calif_Esc + ", id="
				+ id + "]";
	}
	
	

}

package br.usjt.pis.model;

import java.sql.Date;

public class Turma {
	private int id; 
	private Date semestreLetivo, anoLetivo;
	private String sigla;// exemplo CC2AN-BUA
	
	public int getID() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getSemestreLetivo() {
		return semestreLetivo;
	}
	public void setSemestreLetivo(Date semestreLetivo) {
		this.semestreLetivo = semestreLetivo;
	}
	public Date getAnoLetivo() {
		return anoLetivo;
	}
	public void setAnoLetivo(Date anoLetivo) {
		this.anoLetivo = anoLetivo;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
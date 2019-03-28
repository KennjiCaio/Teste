package br.usjt.pis.model;

import java.sql.Date;
import java.util.ArrayList;

public class Banca {
	private int id;
	private Date data;
	private String sala;
	private ArrayList<Professor> professor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public ArrayList<Professor> getProfessor() {
		return professor;
	}
	public void setProfessor(ArrayList<Professor> professor) {
		this.professor = professor;
	}
}

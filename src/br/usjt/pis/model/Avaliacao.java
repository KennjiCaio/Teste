package br.usjt.pis.model;

import java.sql.Date;

public class Avaliacao {
	private int id, turmaAluno;
	private double nota;
	private Date dataAvaliacao;
	private String comentarios;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTurmaAluno() {
		return turmaAluno;
	}
	public void setTurmaAluno(int turmaAluno) {
		this.turmaAluno = turmaAluno;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Date getDataAvaliacao() {
		return dataAvaliacao;
	}
	public void setDataAvaliacao(Date dataAvaliacao) {
		this.dataAvaliacao = dataAvaliacao;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
}

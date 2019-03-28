package br.usjt.pis.model;

import java.sql.Date;

public class Tema{
	private int id;
	private String titulo, introducao, requisito;
	private Atividade atividade;
	private Date dt_cadastro;
	public String getRequisito() {
		return requisito;
	}
	public void setRequisito(String requisito) {
		this.requisito = requisito;
	}
	public String getIntroducao() {
		return introducao;
	}
	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDt_cadastro() {
		return dt_cadastro;
	}
	public void setDt_cadastro(Date dt_cadastro) {
		this.dt_cadastro = dt_cadastro;
	}
}

package br.usjt.pis.model;

import java.sql.Date;

public class Atividade extends Tema{
	private int numeroAtividade;
	private String descricao, formaEntrega;
	private Date dataInicio, dataFinal;
	
	
	public int getNumeroAtividade() {
		return numeroAtividade;
	}
	public void setNumeroAtividade(int numeroAtividade) {
		this.numeroAtividade = numeroAtividade;
	}
	public String getFormaEntrega() {
		return formaEntrega;
	}
	public void setFormaEntrega(String formaEntrega) {
		this.formaEntrega = formaEntrega;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
}

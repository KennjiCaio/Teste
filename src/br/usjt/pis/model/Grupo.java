package br.usjt.pis.model;

public class Grupo {
	private int id, numero;
	private String nome;
	private Professor orientador;
	private Turma turma;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getOrientador() {
		return orientador;
	}
	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}

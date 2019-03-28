package br.usjt.pis.model;

public class Usuario {
	
	private String nome, email, senha;
	private int id;
	
	public Usuario() {
		
	}
	public Usuario(int id, String nome, String email, String senha) {
		this.setId(id);
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	public Usuario(String nome, String email, String senha) {
		this.setNome(nome);
		this.setEmail(email);
		this.setSenha(senha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

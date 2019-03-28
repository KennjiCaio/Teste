package br.usjt.pis.service;

import br.usjt.pis.dao.UsuarioDAO;
import br.usjt.pis.model.Usuario;

public class UsuarioService {
	
	UsuarioDAO usuarioDAO;
	Usuario usuario;
	
	public UsuarioService() {
		this.usuarioDAO = new UsuarioDAO();
	}
	
	public void cadastrar(Usuario usuario) {
		this.usuarioDAO.inserir(usuario);
	}
	
	public void alterar(Usuario usuario) {
		this.usuarioDAO.atualizar(usuario);
	}
	
	public void excluir(int id) {
		this.usuarioDAO.excluir(id);
	}
	
	public Usuario consultar(int id) {
		return usuario = usuarioDAO.consultar(id);
	}
}

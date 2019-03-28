package br.usjt.pis.mainTeste;

import br.usjt.pis.dao.UsuarioDAO;
import br.usjt.pis.model.Usuario;
import br.usjt.pis.service.UsuarioService;

public class Teste {

	public static void main(String args[]) {
		
		
		
		UsuarioService usuarioService = new UsuarioService();
		//usuarioService.cadastrar(usuario)		
		Usuario usuario = usuarioService.consultar(3);
		System.out.println(usuario.getId());
		System.out.println(usuario.getNome());
	}
	
}

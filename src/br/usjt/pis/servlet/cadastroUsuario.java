package br.usjt.pis.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.usjt.pis.model.Usuario;
import br.usjt.pis.service.UsuarioService;


@WebServlet("/cadastroUsuario.do")
public class cadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("txtNome");
		String email = request.getParameter("txtEmail");
		String senha = request.getParameter("txtSenha");
		
		Usuario usuario = new Usuario(nome, email, senha);
		System.out.println(nome + email + senha);
		/*
		usuario.setNome(nome);
		usuario.setEmail(email);
		usuario.setSenha(senha);
		*/
		UsuarioService usuarioService = new UsuarioService();
		usuarioService.cadastrar(usuario);
		
	}

}

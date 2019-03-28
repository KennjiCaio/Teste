package br.usjt.pis.dao;

import br.usjt.pis.factory.Conexao;
import br.usjt.pis.model.*;
import java.sql.*;
import java.util.ArrayList;

public class UsuarioDAO {
	Connection conexao;
	
	public UsuarioDAO() {
		
	}
	
	public UsuarioDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public void inserir(Usuario usuario) {
		try {
			this.conexao = Conexao.conectar();
			
			String slqInsert = "INSERT INTO usuario(nome, email, senha) values (?, ?, ?)";
			PreparedStatement stm = conexao.prepareStatement(slqInsert);
			stm.setString(1, usuario.getNome());
			stm.setString(2, usuario.getEmail());
			stm.setString(3, usuario.getSenha());

			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Usuario usuario) {
		try {
			this.conexao = Conexao.conectar();
			String sqlUpdate = "UPDATE usuario SET nome = ?, email = ?, senha = ? WHERE id = ?";
			
			PreparedStatement stm = conexao.prepareStatement(sqlUpdate);
			stm.setString(1, usuario.getNome());
			stm.setString(2, usuario.getEmail());
			stm.setString(3, usuario.getSenha());
			stm.setInt(4, usuario.getId());
			stm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(int id) {
		try {
			String sqlDelete = "DELETE FROM usuario WHERE id=?";
			this.conexao = Conexao.conectar();
			PreparedStatement ps = conexao.prepareStatement(sqlDelete);
			ps.setInt(1, id);
			ps.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Usuario consultar(int id) {
		try {
			String sqlSelect = "SELECT id, nome, email, senha FROM usuario WHERE id=?";
			this.conexao = Conexao.conectar();
			
			PreparedStatement stm = conexao.prepareStatement(sqlSelect);
			stm.setInt(1, id);
			
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					Usuario usuario = new Usuario();
					usuario.setId(rs.getInt(1));
					usuario.setNome(rs.getString(2));
					usuario.setEmail(rs.getString(3));
					usuario.setSenha(rs.getString(4));
					return usuario;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException ex) {
			System.out.print(ex.getStackTrace());
		}
		return null;
	}
	
}

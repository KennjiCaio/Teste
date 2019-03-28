package br.usjt.pis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.usjt.pis.model.*;

public class TemaDAO {
	Connection conexao;
	
	public TemaDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void inserir(Tema tema) {
		String sqlInsert = "INSERT INTO tema(titulo, introducao, requisito, atividade) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement stm = conexao.prepareStatement(sqlInsert);
			stm.setString(1, tema.getTitulo());
			stm.setString(2, tema.getIntroducao());
			stm.setString(3, tema.getRequisito());
			stm.setObject(4, tema.getAtividade());
			
			stm.execute();
			conexao.commit();
		}catch(SQLException e) {
			e.printStackTrace();
			try {
				conexao.rollback();
			} catch (SQLException ex) {
				System.out.println(ex.getStackTrace());
			}
		}
	}
	
	public void atualizar(Tema tema) {
		String sqlUpdate = "UPDATE tema SET titulo = ?, introducao = ?, requisito = ? WHERE id = ?";
		try (PreparedStatement stm = conexao.prepareStatement(sqlUpdate);) {
			stm.setString(1, tema.getTitulo());
			stm.setString(2, tema.getIntroducao());
			stm.setString(3, tema.getRequisito());
			stm.setInt(4, tema.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conexao.rollback();
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
	}
	
	public void excluir(int id) {
		String sqlDelete = "DELETE FROM tema WHERE id=?";

		try {
			PreparedStatement ps = conexao.prepareStatement(sqlDelete);
			ps.setInt(1, id);

			ps.execute();
			conexao.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conexao.rollback();
			} catch (SQLException ex) {
				System.out.print(ex.getStackTrace());
			}
		}
	}
	
	public Tema consultar(int id) {
		String sqlSelect = "SELECT id, titulo, introducao, requisito, atividade, dt_cadastro FROM tema WHERE id=?";

		try {
			PreparedStatement stm = conexao.prepareStatement(sqlSelect);
			stm.setInt(1, id);

			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					Tema tema = new Tema();
					tema.setId(rs.getInt(1));
					tema.setTitulo(rs.getString(2));
					tema.setIntroducao(rs.getString(3));
					tema.setRequisito(rs.getString(4));
					tema.setAtividade((Atividade) rs.getObject(5));
					return tema;
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

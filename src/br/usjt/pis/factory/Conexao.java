package br.usjt.pis.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch (ClassNotFoundException ex){
			ex.printStackTrace();
		}
	}
	
	//COLOCAR NOME DO BANCO DE DADOS PARA A CONEXÃO
	//USER E SENHA!!!
	public static Connection conectar() throws SQLException{
		String url = "jdbc:mysql://localhost/lpi?useTimezone=true&serverTimezone=UTC";
		String user = "root";
		String senha = "789456123";
		return DriverManager.getConnection(url, user, senha);
	}
	
	public static void desconectar(Connection conexao) throws SQLException{
		conexao.close();
	}
	
}

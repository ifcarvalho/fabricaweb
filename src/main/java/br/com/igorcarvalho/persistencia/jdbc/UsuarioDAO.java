package br.com.igorcarvalho.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.igorcarvalho.persistencia.entidades.Usuario;

public class UsuarioDAO {
	
	private Connection conexao = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuario usuario) {
		
		final String sql = "insert into usuario(nome,login,senha) values (?,?,?)";
		
		try (PreparedStatement preparador = conexao.prepareStatement(sql)) {
			
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			
			preparador.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void alterar(Usuario usuario) {
		
		final String sql = "update usuario set nome = ?, login = ?, senha = ? where id = ?";
		
		try (PreparedStatement preparador = conexao.prepareStatement(sql)) {
			
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getId());
			preparador.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void excluir(Usuario usuario) {
		
		final String sql = "delete from usuario where id = ?";
		
		try (PreparedStatement preparador = conexao.prepareStatement(sql)) {
			
			preparador.setInt(1, usuario.getId());
			preparador.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	

}

package fabricaweb;

import br.com.igorcarvalho.persistencia.entidades.Usuario;
import br.com.igorcarvalho.persistencia.jdbc.UsuarioDAO;

public class TesteUsuarioDAO {

	public static void main(String[] args) {
		testeExcluir();
	}
	
	public static void testeAlterar(){
		//criando o Usuario
				Usuario usuario = new Usuario();
				usuario.setId(4);
				usuario.setNome("Aracele");
				usuario.setLogin("Ara");
				usuario.setSenha("123");
				
				//Persisitindo dados no banco		
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				usuarioDAO.alterar(usuario);
				
				System.out.println("Usuário alterado com sucesso!");
	}
	
	
	public static void testeCadastrar(){
		//criando o Usuario
				Usuario usuario = new Usuario();
				usuario.setNome("Aracele");
				usuario.setLogin("Ara");
				usuario.setSenha("123");
				
				//Persisitindo dados no banco		
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				usuarioDAO.cadastrar(usuario);
				
				System.out.println("Usuário cadastrado com sucesso!");
	}
	
	public static void testeExcluir(){
		//criando o Usuario
				Usuario usuario = new Usuario();
				usuario.setId(3);
				
				//Persisitindo dados no banco		
				UsuarioDAO usuarioDAO = new UsuarioDAO();
				usuarioDAO.excluir(usuario);
				
				System.out.println("Usuário excluído com sucesso!");
	}

}

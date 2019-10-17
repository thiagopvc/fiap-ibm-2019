package br.com.efbit.bo;

import br.com.efbit.beans.Usuario;
import br.com.efbit.dao.UsuarioDAO;

public class UsuarioBO {
	
	public String login(Usuario objetoUsuario) throws Exception {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuario = usuarioDao.getUsuario(objetoUsuario.getCodigo());
		
		//VALIDA��O DO USU�IO
		if (usuario.getCodigo() < 0) 
			return "Usuario nao cadastrado";
		
		//VALIDACAO DO C�DIGO
		if(usuario.getCodigo()>10000 && usuario.getCodigo()<99999)
			return "C�digo inv�lido";
		
		//VALIDA��O DA SENHA
		if (!usuario.getSenha().equals(objetoUsuario.getSenha())) 
			return "Senha incorreta";
		
		return "Login Correto.";

	}	
	
	public boolean verificaLogin(int codigo, String senha) throws Exception{
		UsuarioDAO usuarioDAO= new UsuarioDAO();
		if(usuarioDAO.verificaLogin(codigo, senha)) {
			System.out.println("Usu�rio autenticado");
			return true;
		}else {
			return false;
		}
	}
	
	public String cadastrarUsuario(Usuario objetoUsuario) throws Exception {
		UsuarioDAO usuarioDao = new UsuarioDAO();
//		Usuario usuario = usuarioDao.getUsuario(objetoUsuario.getCodigo());//???
		
		//VALIDA��ES DO C�DIGO
		
		//USUARIO DEVE SER �NICO
//		if(usuario.getCodigo()>0) {
//			return "Usu�rio ja cadastrado.";
//		}
		//CODIGO DEVE IR DE 10.000 AT� 99.999
//		if(usuario.getCodigo()<10000 || usuario.getCodigo()>99999)
//			return "C�digo inv�lido";
		
		//VALIDA��ES DE NOME 
		
		//NOME DEVE SER COMPOSTO
//		if(usuario.getNome().indexOf(" ")<0)
//			return "Nome inv�lido.";
//		
//		//VALIDA��ES DE E-MAIL
//		
//		//E-MAIL DEVE CONTER "@"
//		if(usuario.getEmail().indexOf("@")<0)
//			return "E-mail inv�lido.";
//		//EMAIL DEVE CONTER ".COM"
//		if(usuario.getEmail().indexOf(".com")<0)
//			return "E-mail inv�lido.";
//		
//		//VALIDA��ES DE SENHA
//		
//		//SENHA DEVE SER MAIOR QUE  CARACT�RES
//		if(usuario.getSenha().length()<5)
//			return "Senha inv�lida.";
		
		//PADRONIZA��O
		
		
		objetoUsuario.setNome(objetoUsuario.getNome().toUpperCase());
		objetoUsuario.setEmail(objetoUsuario.getEmail().toUpperCase());
		
		usuarioDao.addUsuario(objetoUsuario);
		usuarioDao.close();
		return "Usu�rio Cadastrado";
		
	}
	
	public Usuario buscarUsuario(int codigo) throws Exception {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		return usuarioDao.getUsuario(codigo);
	}
	
	
	
	public String atualizarUsuario(String novoNome, String novoCpf, String novoEmail, String novaDataNascimento, int codigo) throws Exception {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.updateUsuario(novoNome, novoCpf, novoEmail, novaDataNascimento, codigo);
		return "Usu�rio atualizado";
	}
	
	public String atualizarSenha(int codigo, String novaSenha) throws Exception{
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.updatePassword(novaSenha, codigo);
		return "Senha atualizada";
	}
	
	public String deletarUsuario(int codigo) throws Exception{
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.deleteUsuario(codigo);
		return "Usu�rio deletado";
	}
}

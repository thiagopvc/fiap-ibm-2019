package br.com.efbit.bo;

import br.com.efbit.beans.Usuario;
import br.com.efbit.dao.UsuarioDAO;

public class UsuarioBO {
	
	public String login(Usuario objetoUsuario) throws Exception {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuario = usuarioDao.getUsuario(objetoUsuario.getCodigo());
		
		//VALIDAÇÃO DO USUÁIO
		if (usuario.getCodigo() < 0) 
			return "Usuario nao cadastrado";
		
		//VALIDACAO DO CÓDIGO
		if(usuario.getCodigo()>10000 && usuario.getCodigo()<99999)
			return "Código inválido";
		
		//VALIDAÇÃO DA SENHA
		if (!usuario.getSenha().equals(objetoUsuario.getSenha())) 
			return "Senha incorreta";
		
		return "Login Correto.";

	}	
	
	public boolean verificaLogin(int codigo, String senha) throws Exception{
		UsuarioDAO usuarioDAO= new UsuarioDAO();
		if(usuarioDAO.verificaLogin(codigo, senha)) {
			System.out.println("Usuário autenticado");
			return true;
		}else {
			return false;
		}
	}
	
	public String cadastrarUsuario(Usuario objetoUsuario) throws Exception {
		UsuarioDAO usuarioDao = new UsuarioDAO();
//		Usuario usuario = usuarioDao.getUsuario(objetoUsuario.getCodigo());//???
		
		//VALIDAÇÕES DO CÓDIGO
		
		//USUARIO DEVE SER ÚNICO
//		if(usuario.getCodigo()>0) {
//			return "Usuário ja cadastrado.";
//		}
		//CODIGO DEVE IR DE 10.000 ATÉ 99.999
//		if(usuario.getCodigo()<10000 || usuario.getCodigo()>99999)
//			return "Código inválido";
		
		//VALIDAÇÕES DE NOME 
		
		//NOME DEVE SER COMPOSTO
//		if(usuario.getNome().indexOf(" ")<0)
//			return "Nome inválido.";
//		
//		//VALIDAÇÕES DE E-MAIL
//		
//		//E-MAIL DEVE CONTER "@"
//		if(usuario.getEmail().indexOf("@")<0)
//			return "E-mail inválido.";
//		//EMAIL DEVE CONTER ".COM"
//		if(usuario.getEmail().indexOf(".com")<0)
//			return "E-mail inválido.";
//		
//		//VALIDAÇÕES DE SENHA
//		
//		//SENHA DEVE SER MAIOR QUE  CARACTÉRES
//		if(usuario.getSenha().length()<5)
//			return "Senha inválida.";
		
		//PADRONIZAÇÃO
		
		
		objetoUsuario.setNome(objetoUsuario.getNome().toUpperCase());
		objetoUsuario.setEmail(objetoUsuario.getEmail().toUpperCase());
		
		usuarioDao.addUsuario(objetoUsuario);
		usuarioDao.close();
		return "Usuário Cadastrado";
		
	}
	
	public Usuario buscarUsuario(int codigo) throws Exception {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		return usuarioDao.getUsuario(codigo);
	}
	
	
	
	public String atualizarUsuario(String novoNome, String novoCpf, String novoEmail, String novaDataNascimento, int codigo) throws Exception {
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.updateUsuario(novoNome, novoCpf, novoEmail, novaDataNascimento, codigo);
		return "Usuário atualizado";
	}
	
	public String atualizarSenha(int codigo, String novaSenha) throws Exception{
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.updatePassword(novaSenha, codigo);
		return "Senha atualizada";
	}
	
	public String deletarUsuario(int codigo) throws Exception{
		UsuarioDAO usuarioDao = new UsuarioDAO();
		usuarioDao.deleteUsuario(codigo);
		return "Usuário deletado";
	}
}

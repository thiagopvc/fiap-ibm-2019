package br.com.efbit.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.efbit.beans.Usuario;
import br.com.efbit.bo.UsuarioBO;

@WebServlet("/CadastroServlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String dataNascimento = request.getParameter("data");
		int tipo = 1;
		Usuario usuario = new Usuario(codigo, nome, cpf, email, senha, dataNascimento, tipo);
		UsuarioBO usuarioBO = new UsuarioBO();
		
		//dao
		
		try {
			usuarioBO.cadastrarUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

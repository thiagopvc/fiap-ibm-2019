package br.com.efbit.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.efbit.beans.Usuario;
import br.com.efbit.bo.UsuarioBO;

@WebServlet("/usuarioServlet")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String acao = request.getParameter("acao");
	//	String retorno= "";
		
		if(acao.equals("cadastrar")) {
			try {
				cadastrar(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
//			retorno="login.jsp";
		}
/*		switch (acao) {
		case "cadastrar":
			try {
				cadastrar(request);
				retorno="login.jsp";
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		default:
			break;
		}*/
	}
	
	private void cadastrar(HttpServletRequest request) throws Exception{
		String codigo = request.getParameter("codigo");
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String dataNascimento = request.getParameter("dataNascimento");
		int tipo = Integer.parseInt(request.getParameter("tipo"));
		
		UsuarioBO usuarioBo = new UsuarioBO();
		
		if(codigo.equals("")) {
			Usuario usuario = new Usuario(nome, cpf, email, senha, dataNascimento, tipo);
			usuarioBo.cadastrarUsuario(usuario);
			request.setAttribute("msg", "Cadastrado Conclu�do");
		}else {
			usuarioBo.atualizarUsuario(nome, cpf, email, dataNascimento, tipo);
			request.setAttribute("msg", "Cadastro alterado com sucesso");
		}
	}
	

}
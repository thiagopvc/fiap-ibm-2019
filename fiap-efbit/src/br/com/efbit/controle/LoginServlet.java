package br.com.efbit.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.efbit.bo.UsuarioBO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HttpSession session;   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paremetro = request.getParameter("acao");
		
		if(paremetro.contentEquals("deslogar")) {
			session.invalidate();
			response.sendRedirect("login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		String senha = request.getParameter("senha");
		
		session = request.getSession();
		
		UsuarioBO usuarioBO = new UsuarioBO();
		
		try {
			if (usuarioBO.verificaLogin(codigo, senha)) {
				System.out.println("if servlet true");
				response.sendRedirect("homeAluno.html");
			}else {
				System.out.println("if servlet false");
				response.sendRedirect("login.jsp");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}
}

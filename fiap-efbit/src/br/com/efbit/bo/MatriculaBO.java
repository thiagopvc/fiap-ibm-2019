package br.com.efbit.bo;

import br.com.efbit.beans.Matricula;
import br.com.efbit.beans.Usuario;
import br.com.efbit.dao.MatriculaDAO;

public class MatriculaBO {
	
	public String cadastrarMatricula(Matricula matricula) throws Exception{
		MatriculaDAO matriculaDAO = new MatriculaDAO();
		
		matriculaDAO.addMatricula(matricula);
		matriculaDAO.close();
		
		return "Matr�cula Cadastrada";
	}
	
	public Matricula buscarMatricula(int codigo, Usuario usuario) throws Exception{
		MatriculaDAO matriculaDAO = new MatriculaDAO();
		
		return matriculaDAO.getMatricula(codigo, usuario);
	}
	
	public String autualizarData(String data, int codigo, Usuario usuario) throws Exception{
		MatriculaDAO matriculaDAO = new MatriculaDAO();
		
		matriculaDAO.updateData(data, codigo, usuario);
		
		return "Data de Matr�cula Atualizada";
	}
	
	public String deletarMatricula(int codigo, Usuario usuario) throws Exception{
		MatriculaDAO matriculaDAO = new MatriculaDAO();
		
		matriculaDAO.deleteMatricula(codigo, usuario);
		
		return "Matricula Deletada";
	}
}

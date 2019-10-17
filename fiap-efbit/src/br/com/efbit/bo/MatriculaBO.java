package br.com.efbit.bo;

import br.com.efbit.beans.Matricula;
import br.com.efbit.dao.MatriculaDAO;

public class MatriculaBO {
	
	public String cadastrarMatricula(Matricula matricula) throws Exception{
		MatriculaDAO matriculaDAO = new MatriculaDAO();
		
		matriculaDAO.addMatricula(matricula);
		matriculaDAO.close();
		
		return "Matrícula Cadastrada";
	}
	
	public Matricula buscarMatricula(int codigo, int codigoUsuario) throws Exception{
		MatriculaDAO matriculaDAO = new MatriculaDAO();
		
		return matriculaDAO.getMatricula(codigo, codigoUsuario);
	}
	
	public String autualizarData(String data, int codigo, int codigoUsuario) throws Exception{
		MatriculaDAO matriculaDAO = new MatriculaDAO();
		
		matriculaDAO.updateData(data, codigo, codigoUsuario);
		
		return "Data de Matrícula Atualizada";
	}
	
	public String deletarMatricula(int codigo, int codigoUsuario) throws Exception{
		MatriculaDAO matriculaDAO = new MatriculaDAO();
		
		matriculaDAO.deleteMatricula(codigo, codigoUsuario);
		
		return "Matricula Deletada";
	}
}

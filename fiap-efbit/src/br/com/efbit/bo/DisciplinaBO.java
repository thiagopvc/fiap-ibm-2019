package br.com.efbit.bo;

import br.com.efbit.beans.Disciplina;
import br.com.efbit.dao.DisciplinaDAO;

public class DisciplinaBO {
	
	public String cadastrarDisciplina(Disciplina objetoDisciplina) throws Exception{
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		//padronização
		objetoDisciplina.setNome(objetoDisciplina.getNome().toUpperCase());
		
		disciplinaDAO.addDisciplina(objetoDisciplina);
		disciplinaDAO.close();
		
		return "Disciplina Cadastrada";
	}
	
	public Disciplina buscarDisciplina(int codigo) throws Exception{
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		return disciplinaDAO.getDisciplina(codigo);		
	}
	
	public String atualizarDisciplina(String nome, String descricao, int status, int codigo) throws Exception{
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		disciplinaDAO.updateDisciplina(nome, descricao, status, codigo);
		return "Disciplina Atualizada";
	}
	
	public String atualizarStatusDisciplina(int status, int codigo) throws Exception{
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		disciplinaDAO.updateStatus(status, codigo);
		return "Status da Disciplina Atualizada";
		
	}
	public String deletarDisciplina(int codigo) throws Exception{
		DisciplinaDAO disciplinaDAO = new DisciplinaDAO();
		
		disciplinaDAO.deleteDisciplina(codigo);
		return "Disciplina Deletada";
	}
}

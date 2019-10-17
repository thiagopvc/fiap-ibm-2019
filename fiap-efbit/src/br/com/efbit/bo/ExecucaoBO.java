package br.com.efbit.bo;

import br.com.efbit.beans.Execucao;
import br.com.efbit.dao.ExecucaoDAO;

public class ExecucaoBO {
	
	public String cadastrarExecucao(Execucao execucao) throws Exception{
		ExecucaoDAO execucaoDAO = new ExecucaoDAO();
		
		execucaoDAO.addExecucao(execucao);
		execucaoDAO.close();
		
		return "Execução cadastrada";
	}
	
	public Execucao buscarExecucao(int codigo) throws Exception{
		ExecucaoDAO execucaoDAO = new ExecucaoDAO();
		
		return execucaoDAO.getExecucao(codigo);
	}
	
	public String atualizarAcessos(int acessos, int codigo) throws Exception{
		ExecucaoDAO execucaoDAO = new ExecucaoDAO();
		
		execucaoDAO.updateAcessos(acessos, codigo);
		
		return "Acessos atualizados";
	}
	
	public String atualizarAvaliacao(int avaliacao, int codigo) throws Exception{
		ExecucaoDAO execucaoDAO = new ExecucaoDAO();
		
		execucaoDAO.updateAvaliacao(avaliacao, codigo);
		
		return "Avaliações atualizadas";
	}
	
	public String deletarExecucao(int codigo) throws Exception{
		ExecucaoDAO execucaoDAO = new ExecucaoDAO();
		
		execucaoDAO.deleteExecucao(codigo);
		
		return "Execucao deletada";
	}
	
}

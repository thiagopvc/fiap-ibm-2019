package br.com.efbit.bo;

import br.com.efbit.beans.Capitulo;
import br.com.efbit.beans.Disciplina;
import br.com.efbit.dao.CapituloDAO;

public class CapituloBO {
	
	public String cadastrarCapitulo(Capitulo objetoCapitulo) throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		//padronização
		objetoCapitulo.setNome(objetoCapitulo.getNome().toUpperCase());
		
		capituloDAO.addCapitulo(objetoCapitulo);
		capituloDAO.close();
		return "Cap�tulo Cadastrado";
	}
	
	public Capitulo buscarCapitulo(int codigo, Disciplina disciplina) throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		return capituloDAO.getCapitulo(codigo, disciplina);
	}
	
	public String atualizarCapitulo(String novoNome, String novoPdf, String novoVideo, int novoStatus, int codigo, Disciplina  disciplina) throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		capituloDAO.updateCapitulo(novoNome, novoPdf, novoVideo, novoStatus, codigo, disciplina);
		return "Cap�tulo Atualizado";
	}
	
	public String atualizarStatusCapitulo(int novoStatus, int codigo, Disciplina disciplina) throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		capituloDAO.updateStatus(novoStatus, codigo, disciplina);
		
		return "Status do Cap�tulo Atualizado";
	}
	
	public String deletarCapitulo(int codigo, Disciplina disciplina)throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		capituloDAO.deleteCapitulo(codigo, disciplina);
		
		return "Cap�tulo Deletado";
	}
	
	
}

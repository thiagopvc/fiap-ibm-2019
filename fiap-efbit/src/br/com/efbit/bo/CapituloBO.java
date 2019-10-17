package br.com.efbit.bo;

import br.com.efbit.beans.Capitulo;
import br.com.efbit.dao.CapituloDAO;

public class CapituloBO {
	
	public String cadastrarCapitulo(Capitulo objetoCapitulo) throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		//padroniza��o
		objetoCapitulo.setNome(objetoCapitulo.getNome().toUpperCase());
		
		capituloDAO.addCapitulo(objetoCapitulo);
		capituloDAO.close();
		return "Cap�tulo Cadastrado";
	}
	
	public Capitulo buscarCapitulo(int codigo, int codigoDisciplina) throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		return capituloDAO.getCapitulo(codigo, codigoDisciplina);
	}
	
	public String atualizarCapitulo(String novoNome, String novoPdf, String novoVideo, int novoStatus, int codigo, int codigoDisciplina) throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		capituloDAO.updateCapitulo(novoNome, novoPdf, novoVideo, novoStatus, codigo, codigoDisciplina);
		return "Cap�tulo Atualizado";
	}
	
	public String atualizarStatusCapitulo(int novoStatus, int codigo, int codigoDisciplina) throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		capituloDAO.updateStatus(novoStatus, codigo, codigoDisciplina);
		
		return "Status do Cap�tulo Atualizado";
	}
	
	public String deletarCapitulo(int codigo, int codigoDisciplina)throws Exception{
		CapituloDAO capituloDAO = new CapituloDAO();
		
		capituloDAO.deleteCapitulo(codigo, codigoDisciplina);
		
		return "Cap�tulo Deletado";
	}
	
	
}

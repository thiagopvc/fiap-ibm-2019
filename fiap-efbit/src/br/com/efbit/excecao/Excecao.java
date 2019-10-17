package br.com.efbit.excecao;

import java.sql.SQLException;

public class Excecao extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6043001160081559724L;

	public static String tratarExcecao(Exception e) {
		if(e instanceof NumberFormatException) {
			return "Número Inválido";
		}else if (e instanceof NullPointerException) {
			return "Objeto Nulo";
		}else if (e instanceof SQLException) {
			return "Falha na conexão com BD";
		}else {
			return "Falha Desconhecida";
		}
	}
	
}

package br.com.efbit.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM81214", "021289");
	}
}

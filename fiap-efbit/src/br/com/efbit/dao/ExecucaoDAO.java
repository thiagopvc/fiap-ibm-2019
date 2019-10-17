package br.com.efbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.efbit.beans.Execucao;
import br.com.efbit.conexao.Conexao;

public class ExecucaoDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public ExecucaoDAO() throws Exception {
		con = Conexao.getConnection();
	}
	
	public void close() throws Exception{
		con.close();
	}
	//create
	public int addExecucao(Execucao execucao) throws Exception{
		stmt = con.prepareStatement("INSERT INTO T_EFBIT_EXECUCAO (CD_EXECUCAO, CD_MATRICULA, CD_CAPITULO, CD_USUARIO, CD_DISCIPLNA, NR_ACESSOS, NR_AVALIACAO) VALUES(SQ_EFBIT_CD_EXECUCAO.nextval,?,?,?,?,?,?)");
		stmt.setInt(1, execucao.getCodigoMatricula());
		stmt.setInt(2, execucao.getCodigoCapitulo());
		stmt.setInt(3, execucao.getCodigoUsuario());
		stmt.setInt(4, execucao.getCodigoDisciplina());
		stmt.setInt(5, execucao.getAcessos());
		stmt.setInt(6, execucao.getAvaliacao());
		
		return stmt.executeUpdate();
	}
	//read
	public Execucao getExecucao(int codigo) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM T_EFBIT_EXECUCAO WHERE CD_EXECUCAO=?");
		stmt.setInt(1, codigo);
		rs=stmt.executeQuery();
		if(rs.next()) {
			Execucao execucao = new Execucao();
			execucao.setCodigo(rs.getInt("CD_EXECUCAO"));
			execucao.setCodigoMatricula(rs.getInt("CD_MATRICULA"));
			execucao.setCodigoCapitulo(rs.getInt("CD_CAPITULO"));
			execucao.setCodigoUsuario(rs.getInt("CD_USUARIO"));
			execucao.setCodigoDisciplina(rs.getInt("CD_DISCIPLINA"));
			execucao.setAcessos(rs.getInt("NR_ACESSOS"));
			execucao.setAvaliacao(rs.getInt("NR_AVALIACAO"));
			return execucao;
		}else {
			return new Execucao();
		}
	}
	
//	public Execucao getAcessosPorDisplina(int codigoDisciplina) throws Exception{
//		stmt = con.prepareStatement("SELECT NR_ACESSOS FROM T_EFBIT_EXECUCAO WHERE CD_DISCIPLINA=?");
//		stmt.setInt(1, codigoDisciplina);
//		rs=stmt.executeQuery();
//		if(rs.next()) {
//			Execucao execucao = new Execucao();
//			execucao.setAcessos(rs.getInt("NR_ACESSOS"));
//			return execucao;
//		}else {
//			return new Execucao();
//		}
//	}
//	
//	public Execucao getAvaliacaoPorDisplina(int codigoDisciplina) throws Exception{
//		stmt = con.prepareStatement("SELECT NR_ACESSOS FROM T_EFBIT_EXECUCAO WHERE CD_DISCIPLINA=?");
//		stmt.setInt(1, codigoDisciplina);
//		rs=stmt.executeQuery();
//		if(rs.next()) {
//			Execucao execucao = new Execucao();
//			execucao.setAvaliacao(rs.getInt("NR_AVALIACAO"));
//			return execucao;
//		}else {
//			return new Execucao();
//		}
//	}
	
	//update
	public int updateAcessos(int acessos, int codigo)throws Exception {
		stmt = con.prepareStatement("UPDATE T_EFBIT_EXECUCAO SET NR_ACESSOS=? WHERE CD_EXECUCAO=?");
		stmt.setInt(1, acessos);
		stmt.setInt(2, codigo);
		
		return stmt.executeUpdate();
	}
	public int updateAvaliacao(int avaliacao, int codigo) throws Exception{
		stmt = con.prepareStatement("UPDATE T_EFBIT_EXECUCAO SET NR_AVALIACAO=? WHERE CD_EXECUCAO=?");
		stmt.setInt(1, avaliacao);
		stmt.setInt(2, codigo);
		
		return stmt.executeUpdate();
	}
	//delete
	public int deleteExecucao(int codigo)throws Exception{
		stmt= con.prepareStatement("DELETE FROM T_EFBIT_EXECUCAO WHERE CD_EXECUCAO=?");
		stmt.setInt(1, codigo);
		
		return stmt.executeUpdate();
	}

}

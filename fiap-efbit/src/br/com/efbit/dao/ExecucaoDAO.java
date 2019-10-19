package br.com.efbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.efbit.beans.Capitulo;
import br.com.efbit.beans.Disciplina;
import br.com.efbit.beans.Execucao;
import br.com.efbit.beans.Matricula;
import br.com.efbit.beans.Usuario;
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
		stmt.setInt(1, execucao.getMatricula().getCodigo());
		stmt.setInt(2, execucao.getCapitulo().getCodigo());
		stmt.setInt(3, execucao.getUsuario().getCodigo());
		stmt.setInt(4, execucao.getDisciplina().getCodigo());
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
			MatriculaDAO matDAO = new MatriculaDAO();
			UsuarioDAO usuDAO = new UsuarioDAO();
			Usuario usu = usuDAO.getUsuario(rs.getInt("CD_USUARIO"));
			Matricula mat = matDAO.getMatricula(rs.getInt("CD_MATRICULA"), usu);
			execucao.setMatricula(mat);
			CapituloDAO capDAO = new CapituloDAO();
			DisciplinaDAO discDAO = new DisciplinaDAO();
			Disciplina disc = discDAO.getDisciplina(rs.getInt("CD_DISCIPLINA"));
			Capitulo cap = capDAO.getCapitulo(rs.getInt("CD_CAPITULO"), disc);
			execucao.setCapitulo(cap);
			execucao.setUsuario(usu);
			execucao.setDisciplina(disc);
			capDAO.close();
			usuDAO.close();
			discDAO.close();
			execucao.setAcessos(rs.getInt("NR_ACESSOS"));
			execucao.setAvaliacao(rs.getInt("NR_AVALIACAO"));
			return execucao;
		}else {
			return new Execucao();
		}
	}
	
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

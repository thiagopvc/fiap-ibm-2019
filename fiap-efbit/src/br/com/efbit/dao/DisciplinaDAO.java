package br.com.efbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.efbit.beans.Disciplina;
import br.com.efbit.conexao.Conexao;

public class DisciplinaDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public DisciplinaDAO() throws Exception {
		con = Conexao.getConnection();
	}
	
	public void close()throws Exception{
		con.close();
	}
	
	//create
	public int addDisciplina(Disciplina disciplina) throws Exception{
		stmt = con.prepareStatement("INSERT INTO T_EFBIT_DISCIPLINA (CD_DISCIPLINA, NM_DISCIPLINA, DS_DISCIPLINA, ST_DISCIPLINA) VALUES(SQ_EFBIT_CD_DISCIPLINA.nextval,?,?,?)");
		stmt.setInt(1, disciplina.getCodigo());
		stmt.setString(2, disciplina.getNome());
		stmt.setString(3, disciplina.getDescricao());
		stmt.setInt(4, disciplina.getStatus());
		
		return stmt.executeUpdate();
	}
	//read
	public Disciplina getDisciplina(int codigo) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM T_EFBIT_DISCIPLINA WHERE CD_DISCIPLINA=?");
		stmt.setInt(1, codigo);
		rs =stmt.executeQuery();
		if(rs.next()) {
			Disciplina disciplina = new Disciplina();
			disciplina.setCodigo(rs.getInt("CD_DISCIPLINA"));
			disciplina.setNome(rs.getString("NM_DISCIPLINA"));
			disciplina.setDescricao(rs.getString("DS_DISCIPLINA"));
			disciplina.setStatus(rs.getInt("ST_DISCIPLINA"));
			return disciplina;
		}else {
			return new Disciplina();
		}
	}
	
	public List<Disciplina> pesquisarPorNome(String nome) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM T_EFBIT_DISCIPLINA WHERE NM_DISCIPLINA LIKE ?");
		stmt.setString(1, nome + "%");
		rs = stmt.executeQuery();
		List<Disciplina> lista = new ArrayList<Disciplina>();
		while(rs.next()) {
			lista.add(new Disciplina(rs.getInt("CD_DISCIPLINA"), rs.getString("NM_DISCIPLINA"), rs.getString("DS_DISCIPLINA"), rs.getInt("ST_DISCIPLINA")));
		}
		return lista;
	}
	//update
	public int updateDisciplina(String nome, String descricao, int status, int codigo) throws Exception{
		stmt = con.prepareStatement("UPDATE T_EFBIT_DISCIPLINA SET NM_DISCIPLINA=?, DS_DISCIPLINA=?, ST_DISCIPLINA WHERE CD_DISCIPLINA=?");
		stmt.setString(1, nome);
		stmt.setString(2, descricao);
		stmt.setInt(3, status);
		stmt.setInt(4, codigo);
		
		return stmt.executeUpdate();
	}
	
	public int updateStatus(int status, int codigo) throws Exception{
		stmt = con.prepareStatement("UPDATE T_EFBIT_DISCIPLINA SET ST_DISCIPLINA=? WHERE CD_DISCIPLINA=?");
		stmt.setInt(1, status);
		stmt.setInt(2, codigo);
		
		return stmt.executeUpdate();
	}
	//delete
	public int deleteDisciplina(int codigo) throws Exception{
		stmt = con.prepareStatement("DELETE FROM T_EFBIT_DISCIPLINA WHERE CD_DISCIPLINA=?");
		stmt.setInt(1,codigo);
		
		return stmt.executeUpdate();
	}
	
}

package br.com.efbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.efbit.beans.Matricula;
import br.com.efbit.conexao.Conexao;

public class MatriculaDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public MatriculaDAO() throws Exception {
		con = Conexao.getConnection();
	}
	
	public void close() throws Exception{
		con.close();
	}
	
	//create
	public int addMatricula(Matricula matricula) throws Exception{
		stmt = con.prepareStatement("INSERT INTO T_EFBIT_MATRICULA (CD_MATRICULA, CD_USUARIO, CD_DISCIPLINA, DT_MATRICULA) VALUES(SQ_EFBIT_CD_MATRICULA.nextval,?,?,?)");
		stmt.setInt(1, matricula.getCodigoUsuario());
		stmt.setInt(2, matricula.getCodigoDisciplina());
		stmt.setString(3, matricula.getData());
		
		return stmt.executeUpdate();
	}
	//read
	public Matricula getMatricula(int codigo, int codigoUsuario) throws Exception{
		stmt = con.prepareStatement("SELECT * FROM T_EFBIT_MATRICULA WHERE CD_MATRICULA=? AND CD_USUARIO=?");
		stmt.setInt(1, codigo);
		stmt.setInt(2, codigoUsuario);
		rs=stmt.executeQuery();
		if(rs.next()) {
			Matricula matricula = new Matricula();
			matricula.setCodigo(rs.getInt("CD_MATRICULA"));
			matricula.setCodigoUsuario(rs.getInt("CD_USUARIO"));
			matricula.setCodigoDisciplina(rs.getInt("CD_DISCIPLINA"));
			matricula.setData(rs.getString("DT_DISCIPLINA"));
			return matricula;
		}else {
			return new Matricula();
		}
	}
	//update
	public int updateData(String data, int codigo, int codigoUsuario) throws Exception{
		stmt= con.prepareStatement("UPDATE T_EFBIT_MATRICULA SET DT_MATRICULA=? WHERE CD_MATRICULA=? AND CD_USUARIO=?");
		stmt.setString(1,data);
		stmt.setInt(2, codigo);
		stmt.setInt(3, codigoUsuario);
		
		return stmt.executeUpdate();
	}
	//delete
	public int deleteMatricula(int codigo, int codigoUsuario) throws Exception{
		stmt=con.prepareStatement("DELETE FROM T_EFBIT_MATRICULA WHERE CD_MATRICULA=? AND CD_USUARIO=?");
		stmt.setInt(1, codigo);
		stmt.setInt(3, codigoUsuario);
		
		return stmt.executeUpdate();
	}
}

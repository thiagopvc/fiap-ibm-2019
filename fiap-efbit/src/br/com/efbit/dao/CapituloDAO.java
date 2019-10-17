package br.com.efbit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.efbit.beans.Capitulo;
import br.com.efbit.conexao.Conexao;

public class CapituloDAO {
	private Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public CapituloDAO() throws Exception {
		con = Conexao.getConnection();
	}
	
	public void close() throws Exception{
		con.close();
	}
//create
	public int addCapitulo(Capitulo capitulo) throws Exception{
		stmt = con.prepareStatement("INSERT INTO T_EFBIT_CAPITULO (CD_CAPITULO, CD_DISCIPLINA, NM_CAPITULO, DS_PDF, DS_VIDEO, ST_CAPITULO) VALUES(SQ_EFBIT_CD_CAPITULO.nextval,?,?,?,?,?)");
		stmt.setInt(1, capitulo.getCodigoDisciplina());
		stmt.setString(2, capitulo.getNome());
		stmt.setString(3, capitulo.getPdf());
		stmt.setString(4, capitulo.getVideo());
		stmt.setInt(5, capitulo.getStatus());
		
		return stmt.executeUpdate();
	}
	
//read
	public Capitulo getCapitulo (int codigo, int codigoDisciplina) throws Exception{
		stmt = con.prepareStatement("SELEC * FROM T_EFBIT_CAPITULO WHERE CD_CAPITULO=? AND CD_DISPLINA=?");
		stmt.setInt(1, codigo);
		stmt.setInt(2, codigoDisciplina);
		rs=stmt.executeQuery();
		if(rs.next()) {
			Capitulo capitulo = new Capitulo();
			capitulo.setCodigo(rs.getInt("CD_CAPITULO"));
			capitulo.setCodigoDisciplina(rs.getInt("CD_DISCIPLINA"));
			capitulo.setNome(rs.getString("NM_CAPITULO"));
			capitulo.setPdf(rs.getString("DS_PDF"));
			capitulo.setVideo(rs.getString("DS_VIDEO"));
			capitulo.setStatus(rs.getInt("ST_CAPITULO"));
			return capitulo;
		}else {
			return new Capitulo();
		}
	}
//update
	public int updateCapitulo(String novoNome, String novoPdf, String novoVideo, int novoStatus, int codigo, int codigoDisciplina) throws Exception{
		stmt = con.prepareStatement("UPDATE T_EFBIT_CAPITULO SET NM_CAPITULO=?, DS_PDF=?, DS_VIDEO=?, DS STATUS=? WHERE CD_CAPITULO=? AND CD_DISPLINA=?");
		stmt.setString(1, novoNome);
		stmt.setString(2, novoPdf);
		stmt.setString(3,novoVideo);
		stmt.setInt(4, novoStatus);
		stmt.setInt(5, codigo);
		stmt.setInt(6, codigoDisciplina);
		
		return stmt.executeUpdate();
		
	}
	public int updateStatus(int novoStatus, int codigo, int codigoDisciplina) throws Exception{
		stmt = con.prepareStatement("UPDATE T_EFBIT_CAPITULO SET DS STATUS=? WHERE CD_CAPITULO=? AND CD_DISPLINA=?");
		stmt.setInt(4, novoStatus);
		stmt.setInt(5, codigo);
		stmt.setInt(6, codigoDisciplina);
		
		return stmt.executeUpdate();
		
	}
	
//delete	
	public int deleteCapitulo (int codigo, int codigoDisciplina)throws Exception{
		stmt = con.prepareStatement("DELETE FROM T_EFBIT_CAPITULO WHERE CD_CAPITULO=? AND CD_DISCIPLINA=?");
		stmt.setInt(1, codigo);
		stmt.setInt(2, codigoDisciplina);
		
		return stmt.executeUpdate();
	}
	
}

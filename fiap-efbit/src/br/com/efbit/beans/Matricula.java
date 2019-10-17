package br.com.efbit.beans;

public class Matricula {
	private int codigo;
	private int codigoUsuario;
	private int codigoDisciplina;
	private String data;
	
	public Matricula() {
		super();
	}

	public Matricula(int codigo, int codigoUsuario, int codigoDisciplina, String data) {
		super();
		this.codigo = codigo;
		this.codigoUsuario = codigoUsuario;
		this.codigoDisciplina = codigoDisciplina;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}

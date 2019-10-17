package br.com.efbit.beans;

public class Execucao {
	private int codigo;
	private int codigoMatricula;
	private int codigoCapitulo;
	private int codigoUsuario;
	private int codigoDisciplina;
	private int acessos;
	private int avaliacao;
	
	public Execucao() {
		super();
	}

	public Execucao(int codigo, int codigoMatricula, int codigoCapitulo, int codigoUsuario, int codigoDisciplina, int acessos, int avaliacao) {
		super();
		this.codigo = codigo;
		this.codigoMatricula = codigoMatricula;
		this.codigoCapitulo = codigoCapitulo;
		this.codigoUsuario = codigoUsuario;
		this.codigoDisciplina = codigoDisciplina;
		this.acessos = acessos;
		this.avaliacao = avaliacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoMatricula() {
		return codigoMatricula;
	}

	public void setCodigoMatricula(int codigoMatricula) {
		this.codigoMatricula = codigoMatricula;
	}

	public int getCodigoCapitulo() {
		return codigoCapitulo;
	}

	public void setCodigoCapitulo(int codigoCapitulo) {
		this.codigoCapitulo = codigoCapitulo;
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

	public int getAcessos() {
		return acessos;
	}

	public void setAcessos(int acessos) {
		this.acessos = acessos;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}

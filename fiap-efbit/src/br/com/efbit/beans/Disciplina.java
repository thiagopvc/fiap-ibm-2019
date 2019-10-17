package br.com.efbit.beans;

public class Disciplina {
	private int codigo;
	private String nome;
	private String descricao;
	private int status;
	
	public Disciplina() {
		super();
	}

	public Disciplina(int codigo, String nome, String descricao, int status) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}

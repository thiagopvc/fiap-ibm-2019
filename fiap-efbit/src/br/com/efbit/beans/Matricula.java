package br.com.efbit.beans;

public class Matricula {
	private int codigo;
	private Usuario usuario;
	private Disciplina disciplina;
	private String data;
	
	public Matricula() {
		super();
	}

	public Matricula(int codigo, Usuario usuario, Disciplina disciplina, String data) {
		super();
		this.codigo = codigo;
		this.usuario = usuario;
		this.disciplina = disciplina;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}

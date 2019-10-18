package br.com.efbit.beans;

public class Execucao {
	private int codigo;
	private Matricula matricula;
	private Capitulo capitulo;
	private Usuario usuario;
	private Disciplina disciplina;
	private int acessos;
	private int avaliacao;
	
	public Execucao() {
		super();
	}

	public Execucao(int codigo, Matricula matricula, Capitulo capitulo, Usuario usuario, Disciplina disciplina,
			int acessos, int avaliacao) {
		super();
		this.codigo = codigo;
		this.matricula = matricula;
		this.capitulo = capitulo;
		this.usuario = usuario;
		this.disciplina = disciplina;
		this.acessos = acessos;
		this.avaliacao = avaliacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Capitulo getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(Capitulo capitulo) {
		this.capitulo = capitulo;
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

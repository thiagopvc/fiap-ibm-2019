package br.com.efbit.beans;

public class Capitulo implements Comparable<Capitulo>{
	private int codigo;
	private Disciplina disciplina;
	private String nome;
	private String pdf;
	private String video;
	private int status;
	
	public int compareTo(Capitulo cap) {
		return nome.compareTo(cap.nome);
	}
	
	public Capitulo(int codigo, Disciplina disciplina, String nome, String pdf, String video, int status) {
		super();
		this.codigo = codigo;
		this.disciplina = disciplina;
		this.nome = nome;
		this.pdf = pdf;
		this.video = video;
		this.status = status;
	}
	
//	public Capitulo(int codigo, String nomeDisc, String nome, String pdf, String video, int status) {
//		super();
//		this.codigo = codigo;
//	    this.disciplina.setNome(nomeDisc);
//		this.nome = nome;
//		this.pdf = pdf;
//		this.video = video;
//		this.status = status;
//	}

	public Capitulo() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}

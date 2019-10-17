package br.com.efbit.beans;

public class Capitulo {
	private int codigo;
	private int codigoDisciplina;
	private String nome;
	private String pdf;
	private String video;
	private int status;
	
	public Capitulo() {
		super();
	}

	public Capitulo(int codigo, int codigoDisciplina, String nome, String pdf, String video, int status) {
		super();
		this.codigo = codigo;
		this.codigoDisciplina = codigoDisciplina;
		this.nome = nome;
		this.pdf = pdf;
		this.video = video;
		this.status = status;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
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

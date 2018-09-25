package modelo;

import java.io.Serializable;

public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 2843825292735304280L;
	
	private String nome;
	private String matricula;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

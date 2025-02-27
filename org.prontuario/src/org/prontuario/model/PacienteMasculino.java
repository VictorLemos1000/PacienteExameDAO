package org.prontuario.model;

import java.util.ArrayList;
import java.util.List;

public class PacienteMasculino implements IPaciente{

	private Long id;
	private String nome;
	private String cpf;
	
	private List<Exame> exames = new ArrayList<>();

	
	public PacienteMasculino(Long id) {
		this.id = id;
	}
	
	public PacienteMasculino(Long id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}
	
	@Override
	public String toString() {
		return "PacienteMasculino [id=" + this.id + ", nome=" + this.nome + ", cpf=" + this.cpf + "]";
	}
	
	
	@Override
	public Float calcularIMC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float calcularMetabolismoBasal() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

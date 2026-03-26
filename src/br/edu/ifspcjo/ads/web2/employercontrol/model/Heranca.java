package br.edu.ifspcjo.ads.web2.employercontrol.model;

public abstract class Heranca {
	protected String name;
	protected String cpf;
	public Heranca(String name, String cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract double calculateIncome();
	}
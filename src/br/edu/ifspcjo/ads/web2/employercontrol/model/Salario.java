package br.edu.ifspcjo.ads.web2.employercontrol.model;

public class Salario extends Heranca{
	private double salary;

	public Salario(String name, String cpf, double salary) {
		super(name, cpf);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empregado Assalariado [Salário= R$ " + salary 
				+ ", Nome=" 
				+ name + ", CPF=" + cpf + "]";
	}

	@Override
	public double calculateIncome() {
		return salary;
	}
	
}
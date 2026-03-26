package br.edu.ifspcjo.ads.web2.employercontrol.model;

public class SalariedAndComissionedEmploye extends Comissao {
	
	private double salary;

	public SalariedAndComissionedEmploye(String name, String cpf, 
			double valordevendas, double porcentagemdecomissao,
			double salary) {
		super(name, cpf, valordevendas, porcentagemdecomissao);
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
		return "Empregado Salariado e Comissionado [salário= R$ " + salary + ", valor das vendas= R$ " + Valordevendas + ", percentual de comissão=" + Porcentagemdecomissao + "%, nome=" + name + ", CPF=" + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return salary + super.calculateIncome();
	 }
	
}
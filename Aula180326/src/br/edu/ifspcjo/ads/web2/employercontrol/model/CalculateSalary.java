package br.edu.ifspcjo.ads.web2.employercontrol.model;

public class CalculateSalary extends Heranca{
		
	private int numberOfHoursWorked;
	private double valueOfHoursWorked;

	public CalculateSalary(String name, String cpf,
			int numberOfHoursWorked, double valueOfHoursWorked) {
		super(name, cpf);
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.valueOfHoursWorked = valueOfHoursWorked;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public double getValueOfHoursWorked() {
		return valueOfHoursWorked;
	}

	public void setValueOfHoursWorked(double valueOfHoursWorked) {
		this.valueOfHoursWorked = valueOfHoursWorked;
	}

	@Override
	public String toString() {
		return "Empregado Horista [Número de horas trabalhadas=" 
				+ numberOfHoursWorked + ", Valor da Hora Trabalhada="
				+ valueOfHoursWorked + ", Nome=" + name 
				+ ", CPF=" + cpf + "]";
	}

	@Override
	public double calculateIncome() {
		return numberOfHoursWorked * valueOfHoursWorked;
	}
	
}


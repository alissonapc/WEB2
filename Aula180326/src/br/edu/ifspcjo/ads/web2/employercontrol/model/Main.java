package br.edu.ifspcjo.ads.web2.employercontrol.model;

import br.edu.ifspcjo.ads.web2.employercontrol.model.Heranca;
import br.edu.ifspcjo.ads.web2.employercontrol.model.CalculateSalary;
import br.edu.ifspcjo.ads.web2.employercontrol.model.Salario;
import br.edu.ifspcjo.ads.web2.employercontrol.model.Comissao;
import br.edu.ifspcjo.ads.web2.employercontrol.model.SalariedAndComissionedEmploye;

public class Main {
	
	public static void main(String[] args) {
		
		//Employee empregado0 = new Employee("Eliana", "9876");
		
		Heranca empregado1 = 
				new Salario("Ana", "1234", 3000);
		System.out.println(empregado1);
		System.out.println("Rendimentos = R$ " 
				+ empregado1.calculateIncome());
		Heranca empregado2 = new CalculateSalary("Adriana",
				"5678", 40, 30);
		System.out.println(empregado2);
		System.out.println("Rendimentos = R$ " 
				+ empregado2.calculateIncome());
		Heranca empregado3 = new Comissao(
				"Juliana", "8765", 50000, 5);
		System.out.println(empregado3);
		System.out.println("Rendimentos = R$ " +
				empregado3.calculateIncome());
		Heranca empregado4 = 
				new SalariedAndComissionedEmploye("Mariana", 
				"4321", 50000, 5, 2000);
		System.out.println(empregado4);
		System.out.println("Rendimentos = R$ " +
				empregado4.calculateIncome());
	}

}
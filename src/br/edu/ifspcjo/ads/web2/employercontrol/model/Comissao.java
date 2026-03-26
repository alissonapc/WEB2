package br.edu.ifspcjo.ads.web2.employercontrol.model;

public class Comissao extends Heranca{
	protected double Valordevendas;
	protected double Porcentagemdecomissao;
	
	public Comissao(String name, String cpf, double valordevendas, double porcentagemdecomissao) {
		super(name, cpf);
		this.Valordevendas = valordevendas;
		this.Porcentagemdecomissao = porcentagemdecomissao;
	}

	public double getValordevendas() {
		return Valordevendas;
	}

	public void setValordevendas(double valordevendas) {
		Valordevendas = valordevendas;
	}

	public double getPorcentagemdecomissao() {
		return Porcentagemdecomissao;
	}

	public void setPorcentagemdecomissao(double porcentagemdecomissao) {
		Porcentagemdecomissao = porcentagemdecomissao;
	}
	@Override
	public String toString() {
		return "Comissao [Valordevendas=" + Valordevendas + ", Porcentagemdecomissao=" + Porcentagemdecomissao
				+ ", name=" + name + ", cpf=" + cpf + "]";
	}
	@Override
	public double calculateIncome() {
		return Valordevendas * Porcentagemdecomissao/100;
	}
	
}

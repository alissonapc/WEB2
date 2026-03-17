public class Person {
	private String name;
	private String cpf;
	
	public Person(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getcpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return "Dados da pessoa: [Nome: " + name + " - CPF: " + cpf + "]";
	}
}
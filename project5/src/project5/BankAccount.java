package project5;

public class BankAccount {
	
	int id;
	String clientName;
	double balance;
	
	//construtor da classe com argumentos
	
	public BankAccount(int id, String clientName, double balance) {
		this.id = id;
		this.clientName = clientName;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		}
	}
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	public void displayDetails() {
		System.out.println("Dados da conta: ");
		System.out.println("Código: " + id);
		System.out.println("Nome do Cliente:" + clientName);
		System.out.println("Saldo: R$" + balance);
	}
}

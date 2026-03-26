package project5;

public class Main {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1, "Cliente 1 ", 1000);
		System.out.println(account1);
		account1.displayDetails();
		account1.deposit(1000);
		System.out.println("Saldo Atualizado: R$" + account1.balance);
		account1.withdraw(1500);
		System.out.println("Saldo Após Saque: R$" + account1.balance);
		
		
		BankAccount account2 = new BankAccount(2, "Cliente 2 ", 2000);
		System.out.println(account2);
		account2.displayDetails();

	}
}

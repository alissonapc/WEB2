import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//istanciar um ojeto da classe Scanner
		Scanner teclado;
		teclado = new Scanner(System.in);
		int n1, n2, soma;
		System.out.println("Digite um numero inteiro: ");
		n1 = teclado.nextInt();
		System.out.println("Digite um numero inteiro: ");
		n2 = teclado.nextInt();

		soma = n1 + n2;
		
		System.out.println("Soma =" + soma);
		
		//fechar teclado
		teclado.close();
	}

}

import javax.swing.JOptionPane;

public class Main2 {

	public static void main(String[] args) {
		
		int n1, n2, soma;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Fale um numero inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Fale um numero inteiro: "));
		
		soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "Soma="+soma);
		

	}

}

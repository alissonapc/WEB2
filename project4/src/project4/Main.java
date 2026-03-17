package project4;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Random geradorDeNumeos = new Random();
		 int f1, f2,soma, tentativas, opcao, aposta;
		 boolean acertou;
		 
		 do {
		 f1 = geradorDeNumeos.nextInt(6) + 1;
		 f2 = geradorDeNumeos.nextInt(6) + 1;
		 soma = f1 + f2;
		 tentativas = 3;
		 System.out.println("Face 1: "+ f1 + " + face 2: " + f2 + "  Soma: " + soma);
		 acertou = false;
		 while(!acertou && tentativas > 0) {
			 tentativas --;
			 aposta = Integer.parseInt(JOptionPane.showInputDialog("Digite sua aposta: "));
			 if(aposta == soma) {
				acertou = true;
			 }else {
				JOptionPane.showMessageDialog(null,"Você errou!");
			 }
		 }
		 if(acertou) {
			 JOptionPane.showMessageDialog(null, "Parabéns, você ganhou!");
		 }else {
			 JOptionPane.showInternalMessageDialog(null, "Voce perdeu");
		 }
		 opcao = JOptionPane.showConfirmDialog(null, "Quer tentar novamente? ");

	}while(opcao == 0);
	}
}

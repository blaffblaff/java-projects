package org.Mont;

import javax.swing.JOptionPane;

public class preenchimentoNúmeros {

	public static void main(String[] args) {
		
		double [] vetorNum = new double[5];
		
		for(int i = 0; i < 5; i++) {
			vetorNum[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
		}
		
		for(int i = 0; i < 5 ; i++) {
			JOptionPane.showMessageDialog(null,"O número do " + (i+1) + "º vetor é : " + vetorNum[i]);
		}

	}

}

package org.Mont;

import javax.swing.JOptionPane;

public class preenchimentoN�meros {

	public static void main(String[] args) {
		
		double [] vetorNum = new double[5];
		
		for(int i = 0; i < 5; i++) {
			vetorNum[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero : "));
		}
		
		for(int i = 0; i < 5 ; i++) {
			JOptionPane.showMessageDialog(null,"O n�mero do " + (i+1) + "� vetor � : " + vetorNum[i]);
		}

	}

}

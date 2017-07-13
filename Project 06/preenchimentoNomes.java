package org.Mont;

import javax.swing.JOptionPane;

public class preenchimentoNomes {

	public static void main(String[] args) {

		String[] nomes = new String[5];

		for (int i = 0; i < 5; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite um nome : ");
		}
		
		for(int i = 0; i < 5;i ++) {
			JOptionPane.showMessageDialog(null,"O " + (i+1) +  "º valor é : " + nomes[i]);
		}

	}

}

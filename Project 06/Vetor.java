package org.Mont;

import javax.swing.JOptionPane;

public class Vetor {

	public static void main(String[] args) {

		String[] nomesVetor = new String[5];

		for (int i = 0; i < 5; i++) {

			nomesVetor[i] = JOptionPane.showInputDialog("Digite um nome : ");
		}

		for (int i = 0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, "Nomes no vetor : " + nomesVetor[i]);
		}

	}

}

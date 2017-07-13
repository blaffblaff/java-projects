package org.Mont;

import javax.swing.JOptionPane;

public class vetorMaior {

	public static void main(String[] args) {
		
		
		double vetor[] = new double[4];
		vetor[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para o vetor 1 : "));
		vetor[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para o vetor 2: "));
		vetor[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para o vetor 3:"));
		vetor[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para o vetor 4 :"));
		
		JOptionPane.showMessageDialog(null,"O maior número entre os vetores é o : " + Math.max(vetor[0],Math.max(vetor[1],Math.max(vetor[2], vetor[3]))));
		

	}

}

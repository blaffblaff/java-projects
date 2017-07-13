package org.Mont;

import javax.swing.JOptionPane;

public class tamanhoNomeVetor {

	public static void main(String[] args) {
		String nome = "Lucas";
		double [] vetorNum = new double[5];
		
		for(int i = 0; i < nome.length(); i++) {
			vetorNum[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
		}
		
			JOptionPane.showMessageDialog(null,"Posição nº1 do vetor : " + vetorNum[0] +
					"\nPosição nº2 do vetor : " + vetorNum[1] +
					"\nPosição nº3 do vetor : " + vetorNum[2] +
					"\nPosição nº4 do vetor : " + vetorNum[3] + 
					"\nPosição nº5 do vetor : " + vetorNum[4]) ;
		

	}

}

package org.Mont;

import javax.swing.JOptionPane;

public class tamanhoNomeVetor {

	public static void main(String[] args) {
		String nome = "Lucas";
		double [] vetorNum = new double[5];
		
		for(int i = 0; i < nome.length(); i++) {
			vetorNum[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero : "));
		}
		
			JOptionPane.showMessageDialog(null,"Posi��o n�1 do vetor : " + vetorNum[0] +
					"\nPosi��o n�2 do vetor : " + vetorNum[1] +
					"\nPosi��o n�3 do vetor : " + vetorNum[2] +
					"\nPosi��o n�4 do vetor : " + vetorNum[3] + 
					"\nPosi��o n�5 do vetor : " + vetorNum[4]) ;
		

	}

}

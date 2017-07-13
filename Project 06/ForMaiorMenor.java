package org.Mont;

import javax.swing.JOptionPane;

public class ForMaiorMenor {

	public static void main(String[] args) {
		
		double [] num1 = new double[3];

		
		for(int i = 0; i < 3; i++) {
			num1[i] =  Double.parseDouble(JOptionPane.showInputDialog("Digite um número para o primeiro vetor : "));
		}
		
		double max = num1[0];
		double min = num1 [0];
		
		
		for(int i = 1; i < num1.length; i++) {
			if(num1[i] > max) { 
				max = num1[i];
			}
			else if(num1[i] < min) {
				min = num1[i];
			}
		}
		
		JOptionPane.showMessageDialog(null,"O maior número é : " + max + 
					"\nO menor número é : " + min);
		

	}

}

package org.Mont;


import java.util.Random;

import javax.swing.JOptionPane;

public class vetorFor {

	public static void main(String[] args) {
		
		int [] vetorInteiros = new int[5];
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			vetorInteiros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor : "));
		}
		
		int idx = r.nextInt(vetorInteiros.length);
		int random = (vetorInteiros[idx]);
		
		JOptionPane.showMessageDialog(null,"1� valor : " + vetorInteiros[0] + 
				"\n2� valor : " + vetorInteiros[1] +
				"\n3� valor : " + vetorInteiros[2] +
				"\n4� valor : " + vetorInteiros[3] +
				"\n5� valor : " + vetorInteiros[4] + 
				
				"\nN�mero sorteado entre o vetor foi : " + random);
		
		
		
	
		
	}

}

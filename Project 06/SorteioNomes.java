package org.Mont;

import java.util.Random;

import javax.swing.JOptionPane;

public class SorteioNomes {

	public static void main(String[] args) {
		
		Random r = new Random();
			
		String [] vetorNomes = new String[5];
		
		
		for(int i = 0; i < vetorNomes.length; i ++) {
			vetorNomes[i] = JOptionPane.showInputDialog("Digite um nome : ");
		}

		int idx = r.nextInt(vetorNomes.length);
		String random = vetorNomes[idx];

			JOptionPane.showMessageDialog(null,"Nome sorteado entre os 5 nomes : " + random);
	
		
	}

}

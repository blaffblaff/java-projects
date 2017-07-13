package org.Mont;


import java.util.Random;

import javax.swing.JOptionPane;

public class vetorSorteio {

	public static void main(String[] args) {

		String[] vetorNomes = new String[5];

		Random r = new Random();
		
		vetorNomes[0] = JOptionPane.showInputDialog("Digite o primeiro nome : ");
		vetorNomes[1] = JOptionPane.showInputDialog("Digite o segundo nome : ");
		vetorNomes[2] = JOptionPane.showInputDialog("Digite o terceiro nome : ");
		vetorNomes[3] = JOptionPane.showInputDialog("Digite o quarto nome : ");
		vetorNomes[4] = JOptionPane.showInputDialog("Digite o quinto nome : ");
		
		int idx = r.nextInt(vetorNomes.length);
		String random = (vetorNomes[idx]);

		JOptionPane.showMessageDialog(null,
				"Os nomes dentro do vetor foram : " + "\nPrimeiro nome : " + vetorNomes[0] + "\nSegundo nome : "
						+ vetorNomes[1] + "\nTerceiro nome : " + vetorNomes[2] + "\nQuarto nome : " + vetorNomes[3]
						+ "\nQuinto nome : " + vetorNomes[4] + "\n\nO nome sorteado entre o vetor foi : " + random);
	}

}

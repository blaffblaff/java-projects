package org.Mont;


import java.util.Random;

import javax.swing.JOptionPane;

public class vetorNomes {

	private String nomeSorteados[] = new String[]{
			  "Kristina Rose", "Morgan Lee", "Patrick", "Lucas", "Le",
			  "Ana", "Maria Isabel", "Benje", "Anakin", "Luke"
			};

	public static void main(String[] args) {

		vetorNomes nomes = new vetorNomes();
	
		String nome = nomes.sortearNomes();
		nomes.exibirNome(nome);

	}
	
	public String sortearNomes() {
		Random r = new Random();
		int idx = r.nextInt(nomeSorteados.length);
		return nomeSorteados[idx];
		
	}
	
	public void exibirNome(String nome) {
		JOptionPane.showMessageDialog(null,"Nome sorteado : " + nome);
	}

}

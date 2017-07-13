package org.Mont;

import javax.swing.JOptionPane;

public class tamanhoNome {

	public static void main(String[] args) {
		
		String nome;
		
		nome = JOptionPane.showInputDialog(null,"Digite seu nome : ");
		
		JOptionPane.showMessageDialog(null, "Seu nome : " + nome + 
				"\nTamanho do seu nome : " + nome.length());
		
		if(nome.length() > 30) {
			JOptionPane.showMessageDialog(null,"Uau que nome grande o seu !");
		}
		else {
			JOptionPane.showMessageDialog(null,"Seu nome tem um tamanho normal !");
		}
	}

}

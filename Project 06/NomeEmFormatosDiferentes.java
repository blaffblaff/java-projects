package org.Mont;

import javax.swing.JOptionPane;

public class NomeEmFormatosDiferentes {

	public static void main(String[] args) {
		
	String nome;
	
	nome = JOptionPane.showInputDialog("Digite seu nome : ");
	
	aumentaNome(nome);
	diminuiNome(nome);
	
	}
	
	public static void aumentaNome(String nome) { 
		String upper;
		
		upper = nome.toUpperCase();
		
		JOptionPane.showMessageDialog(null, "Nome : " + upper);
	}
	

	public static void diminuiNome(String nome) { 
		String downer;
		
		downer = nome.toLowerCase();
		
		JOptionPane.showMessageDialog(null, "Nome : " + downer);
	}

}

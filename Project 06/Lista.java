package org.Mont;

import javax.swing.JOptionPane;

public class Lista {

	public static void main(String[] args) {
		
		String [] listaDeDesejos = new String[5];
		
		for(int i = 0; i < 5; i++) {
			listaDeDesejos[i] = JOptionPane.showInputDialog("Escreva um desejo : ");
		}

		for(int i =0; i < 5; i ++) {
			JOptionPane.showMessageDialog(null,"O " + (i+1) + "º desejo : " + listaDeDesejos[i]);
		}
	}

}

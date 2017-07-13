package org.Mont;

import javax.swing.JOptionPane;

public class VerdadeOuNao {

	public static void main(String[] args) {
		
		String mariaBonita = "verdade";
		String LeFeio = "verdade,muito feio";

		if(mariaBonita.equals("verdade")) {
		JOptionPane.showMessageDialog(null,"Isso é verdade!");


		}

		if(LeFeio.equals("verdade,muito feio")) {

		JOptionPane.showMessageDialog(null,"Feio mesmo!");

		}

	}

}

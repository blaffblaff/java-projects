package org.Mont;

import javax.swing.JOptionPane;

public class Recolocador {

	public static void main(String[] args) {
		
		String texto;
		
		
		texto = JOptionPane.showInputDialog("Digite o que quiser : ");
		
		JOptionPane.showMessageDialog(null,texto.replace("l", "a"));

	}

}

package org.Mont;

import javax.swing.JOptionPane;

public class InicioFim {

	public static void main(String[] args) {
		
		int numInicio,numFim;
		
		numInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
		numFim = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro número : "));
		
		for(int i = numInicio; i <= numFim; i++) {
			JOptionPane.showMessageDialog(null,"Número atual : "  + i + 
					"\nNúmero final : " + numFim);
		}
	}

}

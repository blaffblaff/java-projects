package org.Mont;

import javax.swing.JOptionPane;

public class InicioFim {

	public static void main(String[] args) {
		
		int numInicio,numFim;
		
		numInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero : "));
		numFim = Integer.parseInt(JOptionPane.showInputDialog("Digite um outro n�mero : "));
		
		for(int i = numInicio; i <= numFim; i++) {
			JOptionPane.showMessageDialog(null,"N�mero atual : "  + i + 
					"\nN�mero final : " + numFim);
		}
	}

}

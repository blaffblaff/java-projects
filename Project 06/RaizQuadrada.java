package org.Mont;

import javax.swing.JOptionPane;

public class RaizQuadrada {

	public static void main(String[] args) {

		double a,b;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero : "));
		
		b = Math.sqrt(a);
		
		JOptionPane.showMessageDialog(null,"N�mero : " + a + 
				"\nRaiz quadrada : " + String.format("%.1f",b));
		
		
	}

}

package org.Mont;

import javax.swing.JOptionPane;

public class RaizQuadrada {

	public static void main(String[] args) {

		double a,b;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
		
		b = Math.sqrt(a);
		
		JOptionPane.showMessageDialog(null,"Número : " + a + 
				"\nRaiz quadrada : " + String.format("%.1f",b));
		
		
	}

}

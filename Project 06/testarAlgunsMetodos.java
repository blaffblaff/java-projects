package org.Mont;

import javax.swing.JOptionPane;

public class testarAlgunsMetodos {
	
	public static void main(String [] args) {
		
		
		int a,b,c;
		int x;
		boolean z = false;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para A : "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para B : "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para C : "));
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero : "));
		
		org.Mont.algunsMetodos.maior(a,b,c);
		org.Mont.algunsMetodos.sexo('M');
		org.Mont.algunsMetodos.multiplicar(a, b);
		org.Mont.algunsMetodos.booleano(x,z);
		org.Mont.algunsMetodos.imprimirQualquerCoisa();

		
	}

}

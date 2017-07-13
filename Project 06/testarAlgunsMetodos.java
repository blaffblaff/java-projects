package org.Mont;

import javax.swing.JOptionPane;

public class testarAlgunsMetodos {
	
	public static void main(String [] args) {
		
		
		int a,b,c;
		int x;
		boolean z = false;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para A : "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para B : "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para C : "));
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
		
		org.Mont.algunsMetodos.maior(a,b,c);
		org.Mont.algunsMetodos.sexo('M');
		org.Mont.algunsMetodos.multiplicar(a, b);
		org.Mont.algunsMetodos.booleano(x,z);
		org.Mont.algunsMetodos.imprimirQualquerCoisa();

		
	}

}

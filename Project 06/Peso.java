package org.Mont;

import javax.swing.JOptionPane;

public class Peso {

	public static void main(String[] args) {
		
		//Nunca confundir Massa e Peso,pois s�o diferentes;
		//Massa � a caracteristica da mat�ria do corpo e
		//a dificuldade do corpo de ser acelerada.
		//Peso � a For�a que a Terra ou um outro Astro
		//pode atrair o corpo.
		//Sendo o Astro um Corpo Celeste que
		//pode ser qualquer entidade f�sica existente no espa�o sideral.
		//Ou seja quando vamos medir n�o dizemos que vamos
		//medir o Peso e sim a Massa.
		
		double p,m,g;
		
		m = Double.parseDouble(JOptionPane.showInputDialog("Digite a massa do corpo : "));
		g = Double.parseDouble(JOptionPane.showInputDialog("Digite a acelera��o da gravidade do astro : "));
		
		p = m * g;
		
		JOptionPane.showMessageDialog(null,"O Peso � equivalente a : " + (String.format("%.2f", p) +  "N"));
	}

}

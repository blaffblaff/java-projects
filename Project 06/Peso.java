package org.Mont;

import javax.swing.JOptionPane;

public class Peso {

	public static void main(String[] args) {
		
		//Nunca confundir Massa e Peso,pois são diferentes;
		//Massa é a caracteristica da matéria do corpo e
		//a dificuldade do corpo de ser acelerada.
		//Peso é a Força que a Terra ou um outro Astro
		//pode atrair o corpo.
		//Sendo o Astro um Corpo Celeste que
		//pode ser qualquer entidade física existente no espaço sideral.
		//Ou seja quando vamos medir não dizemos que vamos
		//medir o Peso e sim a Massa.
		
		double p,m,g;
		
		m = Double.parseDouble(JOptionPane.showInputDialog("Digite a massa do corpo : "));
		g = Double.parseDouble(JOptionPane.showInputDialog("Digite a aceleração da gravidade do astro : "));
		
		p = m * g;
		
		JOptionPane.showMessageDialog(null,"O Peso é equivalente a : " + (String.format("%.2f", p) +  "N"));
	}

}

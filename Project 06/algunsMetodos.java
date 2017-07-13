package org.Mont;

import javax.swing.JOptionPane;

public class algunsMetodos {

	// Autor do programa : Lucas de Oliveira Alves Monteiro

	public static void main(String[] args) {
	
	}

	public static void imprimir() {
		JOptionPane.showMessageDialog(null, "Testando alguns métodos!!!");
	}

	public static void imprimirTexto(String texto) {
		JOptionPane.showMessageDialog(null, texto);
	}

	public static void somar(int a, int b) {
		JOptionPane.showMessageDialog(null, " Resultado : " + a + b);
	}

	public static void subtrair(int a, int b) {
		JOptionPane.showMessageDialog(null, " Resultado : " + (a - b));
	}

	public static void dividir(double a, double b) {
		JOptionPane.showMessageDialog(null, " Resultado : " + String.format("%.2f", a / b));
	}

	public static void multiplicar(int a, int b) {
		JOptionPane.showMessageDialog(null, "Resultado : " + a * b);
	}

	public static void quadrado(int a) {
		JOptionPane.showMessageDialog(null, Math.pow(a, 2));
	}

	public static void maior(int a, int b, int c) {
		JOptionPane.showMessageDialog(null, Math.max(c, Math.max(a, b)));
	}

	public static void sexo(char c) {
		if (c == 'F')
			JOptionPane.showMessageDialog(null, "Feminino");

		else if (c == 'M')
			JOptionPane.showMessageDialog(null, "Masculino");

		else
			JOptionPane.showMessageDialog(null, "Sexo desconhecido");
	}
	
	public static void booleano (int x,boolean a) {
		
		if (x <= 10) {
			a = true;
			JOptionPane.showMessageDialog(null,"Número do x : " + x + 
				"\nValor do boolean : " + a);
		}
		else { 
			a = false;
			JOptionPane.showMessageDialog(null,"Número do x : " + x + 
					"\nValor do boolean : " + a);
		}
	
	}
	
	public static void imprimirQualquerCoisa() { 
		String texto;
		texto = JOptionPane.showInputDialog("Digite qualquer coisa ai : ");
		JOptionPane.showMessageDialog(null,texto);
	}

	
}

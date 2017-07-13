package org.Mont;

import javax.swing.JOptionPane;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		int qtde;
		
		qtde = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes você vai calcular Fahrenheit para Celsius ?  "));
		
		double [] f = new double[qtde];
		double [] c = new double[qtde];
		
		for(int i = 0; i < f.length; i++) {
			f[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o(s) valore(s) : "));
		}
		
		for(int i = 0; i < c.length; i++) {
			c[i] = 5 * (f[i] - 32) / 9;
		}
		
		for(int i = 0; i < f.length ; i++) {
			JOptionPane.showMessageDialog(null, "Valores Fahrenheit : " + String.format("%.2f",f[i]) + 
					"\nValores Celsius : " + String.format("%.2f",c[i]));
		}


	}

}

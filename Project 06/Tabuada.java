package org.Mont;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
			int num = 0;
			int r;
			
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para fazer a tabuada : "));
			for(int i = 1; i <= 10; i++) {
				r = num * i;
				JOptionPane.showMessageDialog(null,"A tabuada de " + num + " :  " + "\n" +
						num + " X " + i + " = " + r);
			}
	}
}

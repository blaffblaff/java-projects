package org.Mont;

import javax.swing.JOptionPane;

public class areaDoTriangulo {

	// Autor do programa : Lucas de Oliveira Alves Monteiro

	public static void main(String[] args) {
		double area, base, altura;

		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do tri�ngulo : "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do tri�ngulo : "));

		area = (base * altura) / 2;

		JOptionPane.showMessageDialog(null, "�rea do tri�ngulo : " + String.format("%.2f", area));

	}

}

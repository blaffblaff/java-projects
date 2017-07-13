package org.Mont;

import javax.swing.JOptionPane;

public class areaDoTriangulo {

	// Autor do programa : Lucas de Oliveira Alves Monteiro

	public static void main(String[] args) {
		double area, base, altura;

		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo : "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo : "));

		area = (base * altura) / 2;

		JOptionPane.showMessageDialog(null, "Área do triângulo : " + String.format("%.2f", area));

	}

}

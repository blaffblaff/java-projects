package org.Mont;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class Matriz1 {

	public static void main(String[] args) {

		String[][] paisesCapitais = { { "Brasil", "Inglaterra", "Espanha" }, { "Brasíia", "Londres", "Madrí" } };

		String s = Arrays.deepToString(paisesCapitais).replace("], ", "\n").replaceAll(",|\\[|\\]", "");

		JOptionPane.showMessageDialog(null, s);

	}

}

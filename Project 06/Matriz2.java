package org.Mont;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Matriz2 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		String s = Arrays.deepToString(matrix).replace("], ", "\n").replaceAll(",|\\[|\\]", "");

		
		JOptionPane.showMessageDialog(null,s);
	}

}

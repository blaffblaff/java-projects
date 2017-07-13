package org.Mont;

import javax.swing.JOptionPane;

public class ParaTeste {

	public static void main(String[] args) {
		int [] num = new int[10];
		
		for(int i =0 ; i < 10 ; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
			
		}

	}

}

package org.Mont;

import javax.swing.JOptionPane;

public class Diferen�aMaiorMenor {

	public static void main(String[] args) {
		int num,num2,res;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero : "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero : "));
		
		
		if(num > num2) {
			res = num - num2;
			JOptionPane.showMessageDialog(null, "A diferen�a entre " + num + " e " + num2  + " � de : " + res);
		}
		else {
			res = num2 - num;
			JOptionPane.showMessageDialog(null, "A diferen�a entre " + num2 + " e " + num  + " � de : " + res);
		}
		
		
		
		

	}

}

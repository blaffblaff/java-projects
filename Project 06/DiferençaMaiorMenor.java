package org.Mont;

import javax.swing.JOptionPane;

public class DiferençaMaiorMenor {

	public static void main(String[] args) {
		int num,num2,res;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número : "));
		
		
		if(num > num2) {
			res = num - num2;
			JOptionPane.showMessageDialog(null, "A diferença entre " + num + " e " + num2  + " é de : " + res);
		}
		else {
			res = num2 - num;
			JOptionPane.showMessageDialog(null, "A diferença entre " + num2 + " e " + num  + " é de : " + res);
		}
		
		
		
		

	}

}

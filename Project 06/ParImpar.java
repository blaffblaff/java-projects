package org.Mont;

import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {
		
		int num = 0;

		
		do { 
		num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número para ver se é par ou impar" + "\nPara sair digite : 999\n","Número",JOptionPane.QUESTION_MESSAGE));
		
		if(num % 2 == 0) { 
			JOptionPane.showMessageDialog(null,num  + " : " + " par");
		}
		else {
			JOptionPane.showMessageDialog(null,num  + " : " + " impar");
		}
		if(num == 999)  {
			
		}
		}while(num != 999);

	}

}

package org.Mont;

import javax.swing.JOptionPane;

public class ternaryOperator {

	public static void main(String[] args) {

		int x, y;
		String whoIsBigger;

		x = Integer.parseInt(JOptionPane.showInputDialog("Type one number for X : "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Type one number for  Y: "));

		whoIsBigger = (x < y) ? "Is bigger than X" : "Is bigger than Y";

		JOptionPane.showMessageDialog(null, whoIsBigger);
		
		//This is ternary operator or conditional operator
		//Is one if/else statetement with only using ?:
		//The syntax general is :
		//result = testCondition ? value1 : value2
		//The Oracle Documentation says that this statetement can be ready as :
		//“If testCondition is true, assign the value of value1 to result; 
		//otherwise, assign the value of value2 to result.”

	}

}

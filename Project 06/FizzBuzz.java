package org.Mont;

import javax.swing.JOptionPane;

public class FizzBuzz {

	public static void main(String[] args) {
			
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
				JOptionPane.showMessageDialog(null,"Fizz");
			}
			else if(i % 5 == 0) {
				JOptionPane.showMessageDialog(null,"Buzz");
			}
			else { 
				JOptionPane.showMessageDialog(null,i);
			}
			
		}
	}

}

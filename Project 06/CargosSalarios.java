package org.Mont;

import javax.swing.JOptionPane;

public class CargosSalarios {

	public static void main(String[] args) {
		int cargo;
		String nome;
		double salario;
		double salarioFinal;
		
		
		cargo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o seu cargo : " + 
				"\n[1] - Gerente " + 
				"\n[2] - T�cnico " +
				"\n[3] - Auxiliar " +
				"\n[4] - Outros "));
		
		if(cargo == 1) {
			nome  = JOptionPane.showInputDialog("Digite seu nome : ");
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio : "));
			salarioFinal = salario + (salario * 0.05);
			
			JOptionPane.showMessageDialog(null,"Nome : " + nome + 
					"\nCargo : " + "Gerente" + 
					"\nSal�rio : " + salario + 
					"\nAumento de : " + "5%" + 
					"\nTotal : " + salarioFinal);
			
		}
		else if(cargo == 2) {
			nome  = JOptionPane.showInputDialog("Digite seu nome : ");
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio : "));
			salarioFinal = salario + (salario * 0.07);
			
			JOptionPane.showMessageDialog(null,"Nome : " + nome + 
					"\nCargo : " + "T�cnico" + 
					"\nSal�rio : " + salario + 
					"\nAumento de : " + "7%" + 
					"\nTotal : " + salarioFinal);
		}		
		else if(cargo == 3) {
			nome  = JOptionPane.showInputDialog("Digite seu nome : ");
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio : "));
			salarioFinal = salario + (salario * 0.10);
			
			JOptionPane.showMessageDialog(null,"Nome : " + nome + 
					"\nCargo : " + "Auxiliar" + 
					"\nSal�rio : " + salario + 
					"\nAumento de : " + "10%" + 
					"\nTotal : " + salarioFinal);
		}
		else if(cargo == 4) {
			nome  = JOptionPane.showInputDialog("Digite seu nome : ");
			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu sal�rio : "));
			salarioFinal = salario + (salario * 0.04);
			
			JOptionPane.showMessageDialog(null,"Nome : " + nome + 
					"\nCargo : " + "Outros" + 
					"\nSal�rio : " + salario + 
					"\nAumento de : " + "4%" + 
					"\nTotal : " + salarioFinal);
		}
	}

}

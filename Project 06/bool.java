package org.Mont;

import javax.swing.JOptionPane;

import org.Mont.Pessoa;

public class bool {

	public static void main(String[] args) {

		boolean status = false;
		
		String senha,password;
		
		senha = JOptionPane.showInputDialog("Digite sua senha : ");
		password = JOptionPane.showInputDialog("Digite seu password : ");
		
		
		if(password.equals(senha)) {
			status = true;
			JOptionPane.showMessageDialog(null, "Bem vindo,administrador!");
		}
		else { 
			JOptionPane.showMessageDialog(null, "Não compativel senha e password!");
		}
		
		if(status == true) {
			Pessoa p = new Pessoa();
			
			p.inserirDadosPessoa();
			p.apresentarPessoa();
			
		}
		else { 
			JOptionPane.showMessageDialog(null, "Até logo!!!");
		}
	}

}

package org.Mont;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class MD5 {

	public static void main(String[] args) {

		//Breve explicação sobre hash :
		
		//Uma função hash é um algoritmo que mapeia dados de comprimento 
		//variável para dados de comprimento fixo;
		
		//Criando variáveis;
		String username;
		String password;
		String usernameC;
		String passwordC;
		
		
		
		//Input do usuário;
		username = JOptionPane.showInputDialog("Digite seu username : ");
		password = JOptionPane.showInputDialog("Digite seu password : ");
		usernameC = username;
		passwordC = password;
		
		try {
								
			//A classe MessageDigest faz instância de uma MD5;
			
			//MD5 (Message-Digest algorithm 5) é uma função de dispersão criptográfica 
			//(ou função hash criptográfica) de 128 bits unidirecional.
			
			MessageDigest m;
			m = MessageDigest.getInstance("MD5");
			m.update(username.getBytes(), 0, username.length());
			BigInteger login1 = new BigInteger(1, m.digest());
			
			
			//Formatando o resultado em uma cadeia de 32 caracteres, completando com 0 caso falte; 
			username = String.format("%1$032X", login1); 

		
			m.reset(); // <---- Reseta o MessageDigest antes de fazer o password;
			m.update(password.getBytes(), 0, password.length());
			BigInteger password1 = new BigInteger(1, m.digest());
			password = String.format("%1$032X", password1);
			
			//Ouput das variáveis transformadas em hash através do processo de MD5;
			System.out.println("Login : " + username);
			System.out.println("Password : " + password);
			
		}

		catch (NoSuchAlgorithmException e) {
			//Capturando e usando o método printStackTrace para,se houver
			//algo de errado,ele escrever no console o tal  erro;
			e.printStackTrace();
		}
		
	}
}
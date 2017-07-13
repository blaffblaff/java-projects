package Banco;

import javax.swing.JOptionPane;

public class Conta {

	public double saldo;
	public int numero;
	
	
	
	public Conta(double saldo, int numero) {
		this.saldo = saldo;
		this.numero = numero;
	}
	
	public Conta() 
	{
		this(0,0);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void depositar(double valor) 
	{
		saldo = saldo + valor;
	}

	public boolean sacar(double valor) {
		
		if(saldo >= valor)
		{
			saldo = saldo - valor;
			return true;
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O valor sacado é maior que seu saldo atual!");
			return false;				
		}
		
		
	}
	
	public String consultarSaldo() {
		
		return "Saldo: " + this.saldo;
	}
	
	public void transferir(double valor, Conta destino){
		if(this.sacar(valor)){
			destino.depositar(valor);
		}
	}
	
	
}

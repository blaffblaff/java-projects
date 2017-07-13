package Banco;

import javax.swing.JOptionPane;

public class contaCorrente extends Conta{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public contaCorrente(double saldo, int numero, double limite) {
		super(saldo, numero);
		this.limite = limite;
	}
	
	public contaCorrente(){
		this(0, 0, 0);
		
	}
	
	public boolean sacar(double valor){

		if(valor > 0 && (this.getSaldo() + this.limite)>= valor){
			this.setSaldo(this.getSaldo() - valor);
			return true;			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O valor sacado é maior que seu saldo atual!");
			return false;				
		}
	}
	
	public String consultarSaldo(){
		return "Saldo atual: " +getSaldo()+
				"\nLimite: "+getLimite()+
				"\nDisponivel: "+ (getSaldo()+limite);
	}
	
	
	
	

}

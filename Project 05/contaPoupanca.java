package Banco;

public class contaPoupanca extends Conta{
	
	private double reajusteMensal;

	public double getReajusteMensal() {
		return reajusteMensal;
	}

	public void setReajusteMensal(double reajusteMensal) {
		this.reajusteMensal = reajusteMensal;
	}

	public contaPoupanca(double saldo, int numero, double reajusteMensal) {
		super(saldo, numero);
		this.reajusteMensal = reajusteMensal;
	}
	   
	public contaPoupanca(){
		this(0,0,0);
	}
	
	public void calcularRendimento(double taxa){
		if(taxa>0 && getSaldo()>0){
			this.reajusteMensal = getSaldo()*taxa;
		}
	}
	private void atualizarSaldo(){
	setSaldo(getSaldo()+reajusteMensal);
	}
	
}


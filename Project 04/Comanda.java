package Pacote3;
import javax.swing.JOptionPane;
public class Comanda {
	
	private int id;
	private double valorConsumo;
	private double valorEstacionamento;
	private double valorCouvert;
	private double valorDescontoPromocional;
	private double valorTotal;
	
	public Comanda() {
		this(0,0,0,0,0);
	}
	
	

	public Comanda(double valorConsumo, double valorEstacionamento,
			double valorCouvert, double valorDescontoPromocional,
			double valorTotal) {
		this.valorConsumo = valorConsumo;
		this.valorEstacionamento = valorEstacionamento;
		this.valorCouvert = valorCouvert;
		this.valorDescontoPromocional = valorDescontoPromocional;
		this.valorTotal = valorTotal;
	}

	public Comanda(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValorConsumo() {
		return valorConsumo;
	}

	public void setValorConsumo(double valorConsumo) {
		this.valorConsumo = valorConsumo;
	}

	public double getValorEstacionamento() {
		return valorEstacionamento;
	}

	public void setValorEstacionamento(double valorEstacionamento) {
		this.valorEstacionamento = valorEstacionamento;
	}

	public double getValorCouvert() {
		return valorCouvert;
	}

	public void setValorCouvert(double valorCouvert) {
		this.valorCouvert = valorCouvert;
	}

	public double getValorDescontoPromocional() {
		return valorDescontoPromocional;
	}

	public void setValorDescontoPromocional(double valorDescontoPromocional) {
		this.valorDescontoPromocional = valorDescontoPromocional;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	public void lancarGastos() {
		valorDescontoPromocional = 0;
		valorTotal = 0;		
		setValorCouvert(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do Couvert ? : ")));
		setValorEstacionamento(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do Estacionamento ? : ")));
		setValorConsumo(getValorEstacionamento() + getValorCouvert());		
	}
	
	public void verificarPromocao() {
		if(getValorConsumo() > 100) {
			setValorDescontoPromocional(10 * getValorConsumo() / 100);
		}
	}
	
	public void listarComanda() {
		JOptionPane.showMessageDialog(null,"Valor Estacionamento : " + getValorEstacionamento() +
		"\nValor Couvert : " +getValorCouvert() +
		"\nValor Consumo : " + getValorConsumo() +
		"\nDesconto Promocional : " + getValorDescontoPromocional());
	}
	
}

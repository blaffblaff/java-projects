package Pacote;
import javax.swing.JOptionPane;
public class Dvd extends Produto {

	private String diretor;
	private String duracao;
	private String censura;
	
	
	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getCensura() {
		return censura;
	}

	public void setCensura(String censura) {
		this.censura = censura;
	}

	public void listarProduto() {
		JOptionPane.showMessageDialog(null, "Descri��o : " + getDescri�ao() + 
				"\nGen�ro : " + getGenero() + 
				"\nEstoque Disponivel : " + getEstoqueDisponivel() + 
				"\nPre�o Custo : " + getPrecoCusto() +
				"\nPre�o Venda : " + getPrecoVenda() +
				"\nDiretor : " + getDiretor() +
				"\nDura��o : " + getDuracao() +
				"\nCensura : " + getCensura());
	}
	
	public void calcularPrecoVenda(double cotacaoDolar) {
		setPrecoVenda(getPrecoCusto() * cotacaoDolar);
	}
	
}

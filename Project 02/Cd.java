package Pacote;
import javax.swing.JOptionPane;
public class Cd extends Produto{

	private String artista;
	private String gravadora;
	private String paisOrigem;
	
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public void listarProduto() {
		JOptionPane.showMessageDialog(null, "Descrição : " + getDescriçao() + 
				"\nGenêro : " + getGenero() + 
				"\nEstoque Disponivel : " + getEstoqueDisponivel() + 
				"\nPreço Custo : " + getPrecoCusto() +
				"\nPreço Venda : " + getPrecoVenda() +
				"\nArtista : " + getArtista() +
				"\nGravadora : " + getGravadora() +
				"\nPais de Origem : " + getPaisOrigem());
	}
	
	public void calcularPrecoVenda() {
		setPrecoVenda(getPrecoCusto() * 0.15);
	}
}

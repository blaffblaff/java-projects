package Pacote;
import javax.swing.JOptionPane;

public class Livro extends Produto {

	private String editora;
	private String edicao;
	private String autor;
	
	
	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getEdicao() {
		return edicao;
	}


	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	
	public void listarProduto() {
		JOptionPane.showMessageDialog(null, "Descri��o : " + getDescri�ao() + 
				"\nGen�ro : " + getGenero() + 
				"\nEstoque Disponivel : " + getEstoqueDisponivel() + 
				"\nPre�o Custo : " + getPrecoCusto() +
				"\nPre�o Venda : " + getPrecoVenda() +
				"\nAutor : " + getAutor() +
				"\nEditora : " + getEditora() +
				"\nEdi��o : " + getEdicao());
	
	}


}

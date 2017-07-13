package Pacote;

public class Produto {

private String descriçao;
private String genero;
private int estoqueDisponivel;
private double precoCusto;
private double precoVenda;



public Produto() {
	this("","",0,0,0);
}

public Produto(String descriçao,String genero,int estoqueDisponivel,double precoCusto,double precoVenda) {
	this.descriçao = descriçao;
	this.genero = genero;
	this.estoqueDisponivel = estoqueDisponivel;
	this.precoCusto = precoCusto;
	this.precoVenda = precoVenda;
}



public String getDescriçao() {
	return descriçao;
}

public void setDescriçao(String descriçao) {
	this.descriçao = descriçao;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public int getEstoqueDisponivel() {
	return estoqueDisponivel;
}

public void setEstoqueDisponivel(int estoqueDisponivel) {
	this.estoqueDisponivel = estoqueDisponivel;
}

public double getPrecoCusto() {
	return precoCusto;
}

public void setPrecoCusto(double precoCusto) {
	this.precoCusto = precoCusto;
}

public double getPrecoVenda() {
	return precoVenda;
}

public void setPrecoVenda(double precoVenda) {
	this.precoVenda = precoVenda;
}


public void comprar(int qtde) {
	estoqueDisponivel = qtde + estoqueDisponivel;
}

public void vender(int qtde) {
	estoqueDisponivel -= qtde;
}

public void calcularPrecoVenda() {
	precoVenda = (precoCusto * 0.10);
}


}

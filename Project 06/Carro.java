package org.Mont;

import javax.swing.JOptionPane;

public class Carro {

	public String marca;
	public String com;
	public double marcha;
	public double velocidade;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public double getMarcha() {
		return marcha;
	}

	public void setMarcha(double marcha) {
		this.marcha = marcha;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void movimentar() {
		setVelocidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade : ")));
	}

	public void parar() {
		velocidade--;
	}

	public double consultar() {
		JOptionPane.showMessageDialog(null, velocidade);
		return velocidade;

	}

}

package org.LucasMont;

import javax.swing.JOptionPane;

public class Percurso {

	private double kmPercorrida;
	private double valorCombustivel;
	private double valorPedagio;

	public double getKmPercorrida() {
		return kmPercorrida;
	}

	public void setKmPercorrida(double kmPercorrida) {
		this.kmPercorrida = kmPercorrida;
	}

	public double getValorCombustivel() {
		return valorCombustivel;
	}

	public void setValorCombustivel(double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}

	public double getValorPedagio() {
		return valorPedagio;
	}

	public void setValorPedagio(double valorPedagio) {
		this.valorPedagio = valorPedagio;
	}

	public void cadastrarPercurso() {
		setKmPercorrida(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite os km percorridos : ",
				"Km percorridos", JOptionPane.QUESTION_MESSAGE)));
		setValorCombustivel(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do combustivel : ",
				"Combustivel", JOptionPane.QUESTION_MESSAGE)));
		setValorPedagio(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do pedágio : ", "Pedágio",
				JOptionPane.QUESTION_MESSAGE)));
	}

	public void listarPercurso() {
		JOptionPane.showMessageDialog(null, "Km percorridos : " + getKmPercorrida() + "\nValor do combustivel : "
				+ getValorCombustivel() + "\nValor do pedágio : " + getValorPedagio());
	}

}

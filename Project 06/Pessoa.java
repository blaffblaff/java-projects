package org.Mont;

import javax.swing.JOptionPane;

public class Pessoa {


	public String nome;
	public String endereco;
	public String telefone;
	
	public Pessoa() {
		this("", "", "");
	}

	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void inserirDadosPessoa() {
		this.setNome(JOptionPane.showInputDialog("Digite seu nome : "));
		this.setEndereco(JOptionPane.showInputDialog("Digite seu endereço : "));
		this.setTelefone(JOptionPane.showInputDialog("Digite seu telefone : "));
		
	}

	public void apresentarPessoa() {
		JOptionPane.showMessageDialog(null, "Nome : " + this.getNome() + "\nEndereço : " + this.getEndereco()
				+ "\nTelefone : " + this.getTelefone());
	}

}

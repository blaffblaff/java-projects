package Pacote;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		Livro l = new Livro();
		Dvd dvd = new Dvd();
		Cd cd = new Cd();
		
		int op1,op2;
		
		op1 = Integer.parseInt(JOptionPane.showInputDialog("[1] - Livro" + 
		"\n[2] - CD" +
		"\n[3] - DVD" +
		"\n[0] - Sair"));
		
		if(op1 == 1) {
			
			do { 
				
			op2 = Integer.parseInt(JOptionPane.showInputDialog("[1] - Cadastrar " +
			"\n[2] - Comprar" + 
			"\n[3] - Calcular Pre�o de Venda" +
			"\n[4] - Vender" +
			"\n[5] - Listar" +
			"\n[0] - Sair"));
				
			switch(op2) {
			
			case 1 :
			l.setAutor(JOptionPane.showInputDialog("Digite o nome do Autor : "));
			l.setGenero(JOptionPane.showInputDialog("Qual o g�nero do Livro ? : "));
			l.setEdicao(JOptionPane.showInputDialog("Qual a Edi��o do Livro ? :"));
			l.setEditora(JOptionPane.showInputDialog("Qual a Editora do Livro ? : "));
			l.setDescri�ao(JOptionPane.showInputDialog("Qual a Descri��o do Livro ? :"));
			l.setPrecoCusto(Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o do Livro ? :")));
			break;
			
			case 2 :
			l.setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog("Quantos voc� deseja comprar?")));
			JOptionPane.showMessageDialog(null,"Estoque Atual : " + l.getEstoqueDisponivel());
			break;
			
			case 3 :
			l.calcularPrecoVenda();
			JOptionPane.showMessageDialog(null,"Pre�o de Venda : " + l.getPrecoVenda());
			break;
			
			case 4 :
			int pd = (Integer.parseInt(JOptionPane.showInputDialog("Quantos voc� deseja vender ?")));
			l.vender(pd);
			JOptionPane.showMessageDialog(null,"Estoque Atual : " + l.getEstoqueDisponivel());
			break;
			case 5 :
			l.listarProduto();		
			break;
			}
			}while(op2 !=0);
			}
		
		if (op1 == 2) {
			
			do {
			op2 = Integer.parseInt(JOptionPane.showInputDialog("[1] - Cadastrar " +
					"\n[2] - Comprar" + 
					"\n[3] - Calcular Pre�o de Venda" +
					"\n[4] - Vender" +
					"\n[5] - Listar" +
					"\n[0] - Sair"));
			
			
			switch(op2) {
			
			case 1 :
			cd.setArtista(JOptionPane.showInputDialog("Qual o nome do Artista do CD ? : "));
			cd.setDescri�ao(JOptionPane.showInputDialog("Qual a descri��o do CD ? : "));
			cd.setGenero(JOptionPane.showInputDialog("Qual o g�nero do CD ?  :"));
			cd.setGravadora(JOptionPane.showInputDialog("Qual a gravadora do CD ? : "));
			cd.setPaisOrigem(JOptionPane.showInputDialog("Qual o pais de origem do CD ? :"));
			cd.setPrecoCusto(Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o do CD ? : ")));
				
			break;
			
			case 2 :
			cd.setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog("Quantos voc� deseja comprar?")));
			JOptionPane.showMessageDialog(null,"Estoque Atual : " + cd.getEstoqueDisponivel());	
			break;
			
			case 3 :
			cd.calcularPrecoVenda();
			JOptionPane.showMessageDialog(null,"Pre�o de Venda  : " + cd.getPrecoVenda());
			break;
			
			case 4 :
			int pd = Integer.parseInt(JOptionPane.showInputDialog("Quantos voc� deseja vender ?"));
			cd.vender(pd);
			JOptionPane.showMessageDialog(null,"Estoque Atual : " + cd.getEstoqueDisponivel());				
			break;
			
			case 5 :
			cd.listarProduto();
			break;
			
			}
			}while(op2 !=0);
		}
		
			if (op1 == 3) {
			
			do {
			
			op2 = Integer.parseInt(JOptionPane.showInputDialog("[1] - Cadastrar " +
					"\n[2] - Comprar" + 
					"\n[3] - Calcular Pre�o de Venda" +
					"\n[4] - Vender" +
					"\n[5] - Listar" +
					"\n[0] - Sair"));
			
			
			switch(op2) {
			
			case 1 :
			dvd.setDescri�ao(JOptionPane.showInputDialog("Qual a descri��o do DVD ? :"));
			dvd.setDiretor((JOptionPane.showInputDialog("Qual � o diretor ? :")));
			dvd.setDuracao(JOptionPane.showInputDialog("Qual a dura��o do DVD ? : "));
			dvd.setGenero(JOptionPane.showInputDialog("Qual o g�nero do DVD ? : "));
			dvd.setCensura(JOptionPane.showInputDialog("H� censura no DVD ? : "));
			dvd.setPrecoCusto(Double.parseDouble(JOptionPane.showInputDialog("Qual o pre�o do DVD ? : ")));
			break;
			
			case 2 :
			dvd.setEstoqueDisponivel(Integer.parseInt(JOptionPane.showInputDialog("Quantos voc� deseja comprar?")));
			JOptionPane.showMessageDialog(null,"Estoque Atual : " + dvd.getEstoqueDisponivel());		
			break;
			
			case 3 :
			dvd.calcularPrecoVenda();
			JOptionPane.showMessageDialog(null,"Pre�o de Venda : " + dvd.getPrecoVenda());
			break;
			
			case 4 :
			int pd = (Integer.parseInt(JOptionPane.showInputDialog("Quantos voc� deseja vender ?")));
			dvd.vender(pd);
			JOptionPane.showMessageDialog(null,"Estoque Atual : " + dvd.getEstoqueDisponivel());			
			break;
			
			case 5 :
			dvd.listarProduto();
			break;
			
			}
			}while(op2 !=0);
		}
			
			
		}

	}

	



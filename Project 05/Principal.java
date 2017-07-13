package Banco;

import javax.swing.JOptionPane;

public class Principal {

	
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta destino = new Conta();
		Conta cc = new Conta();
		Conta cp = new Conta();
		
		int op;
		op = Integer.parseInt(JOptionPane.showInputDialog("		 MENU \n[1]Conta  \n[2] ContaCorrente \n[3] ContaPoupança"));
		
		switch (op){
		case 1:

		op = Integer.parseInt(JOptionPane.showInputDialog("      MENU \n[1] Entrada \n[2] Retirada \n[3]Consultar Saldo \n[4] Transferir \n[0] Sair"));
			switch(op) {
		
			case 1:
			c.depositar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: ")));
			JOptionPane.showMessageDialog(null, c.consultarSaldo());
			break;
			
			case 2:			
			c.sacar(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: ")));
			JOptionPane.showMessageDialog(null, c.consultarSaldo());		
			break;
			
			case 3:		
				JOptionPane.showMessageDialog(null,c.consultarSaldo());
			break;
			
			case 4:
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da transferencia"));
							
				c.transferir(valor,destino);
				JOptionPane.showMessageDialog(null, "Saldo transferido " + destino.consultarSaldo() + " ,Saldo atual " + c.consultarSaldo());
			break;
		
			case 0:
			System.exit(0);
			break;
			
			default:
			JOptionPane.showMessageDialog(null,"SEU ANIMAL, VC SO TEM 5 OPÇÕES");
			break;
			}
			
		case 2:
			
			}
		
		}
			
	}

	



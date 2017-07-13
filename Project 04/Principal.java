package Pacote3;
import javax.swing.JOptionPane;
public class Principal {

	

	public static void main(String[] args) {
		
		Comanda controleMesa = new Comanda();
		Caixa caixa = new Caixa();
		controleMesa.setId(0);
		
		int op;
		
		controleMesa.setId(Integer.parseInt(JOptionPane.showInputDialog("Qual o ID da mesa ? :")));
		
		do { 
			
		op = Integer.parseInt(JOptionPane.showInputDialog("[1] - Lançar gastos "
				+ "\n[2] - Verificar promoção" 
				+ "\n[3] - Fechar mesa "
				+ "\n[4] - Listar comanda"
				+ "\n[0] - Sair"));
		
		switch(op) {
		
		case 1 :
		controleMesa.lancarGastos();
		break;
		
		
		case 2 :
		controleMesa.verificarPromocao();
		JOptionPane.showMessageDialog(null,"Desconto Promocional : " + controleMesa.getValorDescontoPromocional());
		break;
		
		case 3 :
		JOptionPane.showMessageDialog(null,"Mesa Fechada");
		JOptionPane.showMessageDialog(null,"ID da comanda : " + controleMesa.getId());
		controleMesa.setValorConsumo(0);
		controleMesa.setValorCouvert(0);
		controleMesa.setValorDescontoPromocional(0);
		controleMesa.setValorEstacionamento(0);
		controleMesa.setId(0);
		
		break;
		
		case 4 :
		controleMesa.listarComanda();
		JOptionPane.showMessageDialog(null,"Valor Total : " + caixa.totalizarComanda(controleMesa));
		break;
		
		case 0 :
		JOptionPane.showMessageDialog(null,"Até logo");
		System.exit(0);
		}
	}while(op != 0);
	}


}

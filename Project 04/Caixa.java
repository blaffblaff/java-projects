package Pacote3;
import javax.swing.JOptionPane;
public class Caixa {
	
	public double totalizarComanda(Comanda mesa) {
		
		
		mesa.setValorTotal(mesa.getValorCouvert() + mesa.getValorEstacionamento() - mesa.getValorDescontoPromocional() );	 		 
		return mesa.getValorTotal();
		
		
		
		
	}


}

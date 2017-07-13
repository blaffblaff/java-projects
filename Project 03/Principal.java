package org.LucasMont;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Percurso percurso = new Percurso();
		Percurso[] percursos = new Percurso[]{percurso};
		Custos custos = new Custos();
		int op;
		
		op = Integer.parseInt(JOptionPane.showInputDialog("[1] - Novo percurso" + 
				"\n[2] - Apresentar percurso " + 
				"\n[3] - Calcular viagens " + 
				"\n[0] - Sair"));
		
		do  {
			 
		switch(op) {
		
		case 1 :
			percurso.cadastrarPercurso();
			
			op = Integer.parseInt(JOptionPane.showInputDialog("[1] - Novo percurso" + 
					"\n[2] - Apresentar percurso " + 
					"\n[3] - Calcular viagens " + 
					"\n[0] - Sair"));
			
			
		break;
		
		
		case 2 : 
			percurso.listarPercurso();
			
			op = Integer.parseInt(JOptionPane.showInputDialog("[1] - Novo percurso" + 
					"\n[2] - Apresentar percurso " + 
					"\n[3] - Calcular viagens " + 
					"\n[0] - Sair"));
			
		break;
		
		
		case 3 : 						
			JOptionPane.showMessageDialog(null,"Total da viagem : "  + custos.calcularViagem(percursos));
			
			op = Integer.parseInt(JOptionPane.showInputDialog("[1] - Novo percurso" + 
					"\n[2] - Apresentar percurso " + 
					"\n[3] - Calcular viagens " + 
					"\n[0] - Sair"));
		break;
		
		
		case 0 :
			System.exit(0);
			
		break;
		
		default : 
			
			
		break;
		
		
		
		
		}
		}while(op != 0);

	}

}

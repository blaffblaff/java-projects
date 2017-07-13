package org.LucasMont;

public class Custos {

	private double totalPercurso;

	public double getTotalPercurso() {
		return totalPercurso;
	}

	public void setTotalPercurso(double totalPercurso) {
		this.totalPercurso = totalPercurso;
	}

	public String calcularViagem(Percurso[] p) {
		totalPercurso = 0;
		
		for(int indice = 0; indice < p.length; indice++) { 
		Percurso percurso =p[indice];
		totalPercurso = totalPercurso + (percurso.getKmPercorrida() * percurso.getValorCombustivel()) + percurso.getValorPedagio();
		
		}
		
		return String.valueOf(totalPercurso);

	}

}

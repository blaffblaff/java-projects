package org.Mont;


import javax.swing.JOptionPane;

public class Principal5 {

	public static void main(String[] args) {

		Triangulo objTriangulo = new Triangulo();
		double ld[] = new double[3];
		
		ld[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A : "));
		ld[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado B : "));
		ld[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado C : "));
		
		objTriangulo.setLado(ld);
		
	
		
		if(objTriangulo.isTriangle() == true) { 
			
			objTriangulo.calcularArea();
			objTriangulo.calcularPerimetro();
			
			JOptionPane.showMessageDialog(null,"Lado A : " + ld[0] + "\nLado B : " + ld[1] + 
						"\nLado C : " + ld[2] +
						"\nPer�metro : " + objTriangulo.getPerimetro() + 
						"\n�rea : " +  String.format("%.2f",objTriangulo.getArea()) + 
						"\nTipo : " + objTriangulo.getTipo()) ;
			
		}
		else { 
			JOptionPane.showMessageDialog(null,"N�o forma um tri�ngulo ");
		}
	}

}

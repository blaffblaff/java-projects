package Pacote;
import javax.swing.JOptionPane;
public class Principal {
	
	
	public static void main(String[] args) {
		Triangulo t = new Triangulo();
		double ld[] = new double[3];
		
			
		ld[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A : "));
		ld[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado B : "));
		ld[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado C : "));
			
		t.setLado(ld);
		t.calcularArea();
		
		
		if(t.isTriangle() == true) {
		JOptionPane.showMessageDialog(null,"Lado A : " + ld[0] + "\nLado B : " + ld[1] + "\nLado C : " + ld[2] +
				"\nClassificação : " + t.getTipo() + "\nPerimetro : " +  t.getPerimetro() + String.format("\nArea :  %.2f",t.getArea()));
		}
		else {
			JOptionPane.showMessageDialog(null, "Valores inseridos não formam um triângulo");
		}
	}

}

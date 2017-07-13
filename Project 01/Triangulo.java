package Pacote;

public class Triangulo {
	
private double lado[] = new double[3];
private String tipo;
private double perimetro;
private double area;

public double[] getLado() {
	return lado;
}

public void setLado(double[] lado) {
	this.lado = lado;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public double getPerimetro() {
	return perimetro;
}

public void setPerimetro(double perimetro) {
	this.perimetro = perimetro;
}

public double getArea() {
	return area;
}

public void setArea(double area) {
	this.area = area;
}

public boolean isTriangle() {
	if(lado[0] < lado[1] + lado[2] && lado[1] < lado[0] + lado[2]  && lado[2] < lado[0] + lado[1]) {
		classificar();
		perimetro = lado[0] + lado[1] + lado[2];
		return true;
		}
	return false;
}

public void classificar() {
	if(lado[0] == lado[1] && lado[1] == lado[2]) {
		tipo = "Triângulo equilátero";
	}
	else if(lado[0] == lado[1] || lado[2] == lado[1]) {
		tipo = "Triângulo isósceles";
	}
	else if(lado[0] != lado[1] && lado[1] !=lado[2]) {
		tipo = "Triângulo escaleno";
	}
}

public double calcularPerimetro() {
	isTriangle();	
	perimetro = lado[0] + lado[1] + lado[2];
	return 0;
}

public double calcularArea() {
		isTriangle();
		if(isTriangle() == true) {
		double sp = (perimetro / 2);
		area = Math.sqrt(sp * (sp - lado[0]) * (sp - lado[1]) * (sp - lado[2]));		
		}		
			return 0;		
	}
	


}

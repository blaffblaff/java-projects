package org.Mont;

public class outrosMetodos {

	// Autor do programa : Lucas de Oliveira Alves Monteiro

	public static void main(String[] args) {

	}

	public static String diaPorExtenso(int dia) {
		String extenso = "Domingo";
		if (dia == 2)
			extenso = "Segunda";
		else if (dia == 3)
			extenso = "Terça";
		else if (dia == 4)
			extenso = "Quarta";
		else if (dia == 5)
			extenso = "Quinta";
		else if (dia == 6)
			extenso = "Sexta";
		else if (dia == 7)
			extenso = "Sábado";
		else
			extenso = "Dia não reconhecido";
		return extenso;
	}

	public static int contaLetrasA(String palavra) {
		int quantidade = 0;
		palavra = palavra.toUpperCase();
		for (int a = 0; a < palavra.length(); a++) {
			if (palavra.charAt(a) == 'A')
				quantidade++;
		}
		return quantidade;

	}
}

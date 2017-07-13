package org.Mont;

public class MultidimensionalArray {

	public static void main(String[] args) {
		
		
		int arrayNumbers [][]  = new int [6][5];
		int rows = 6,columns = 5;
		
		//Coluna 1;
		
		arrayNumbers[0][0] = 10;
		arrayNumbers[0][1] = 12;
		arrayNumbers[0][2] = 43;
		arrayNumbers[0][3] = 11;
		arrayNumbers[0][4] = 22;
		
		//Coluna 2;
		
		arrayNumbers[1][0] = 20;
		arrayNumbers[1][1] = 45;
		arrayNumbers[1][2] = 56;
		arrayNumbers[1][3] = 1;
		arrayNumbers[1][4] = 33;
		
		//Coulna 3;
		
		arrayNumbers[2][0] = 30;
		arrayNumbers[2][1] = 67;
		arrayNumbers[2][2] = 32;
		arrayNumbers[2][3] = 14;
		arrayNumbers[2][4] = 44;
		
		//Coluna 4;
		
		arrayNumbers[3][0] = 40;
		arrayNumbers[3][1] = 12;
		arrayNumbers[3][2] = 87;
		arrayNumbers[3][3] = 14;
		arrayNumbers[3][4] = 55;
		
		
		//Coluna 5;
		
		arrayNumbers[4][0] = 50;
		arrayNumbers[4][1] = 86;
		arrayNumbers[4][2] = 66;
		arrayNumbers[4][3] = 13;
		arrayNumbers[4][4] = 66;
		
		//Coluna 6;
		
		arrayNumbers[5][0] = 60;
		arrayNumbers[5][1] = 53;
		arrayNumbers[5][2] = 44;
		arrayNumbers[5][3] = 12;
		arrayNumbers[5][4] = 11;
		
		
		for(int i = 0; i < rows;i++) { 
			for(int j = 0; j < columns; j++) { 
				System.out.print(arrayNumbers[i][j] + " ");
			}
			System.out.println( "" );
		}
		
		
		
	}

}

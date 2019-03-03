package br.com.fsma.matriz.negocio;

import br.com.fsma.matriz.negocio.especificacao.Matriz3x3;
import br.com.fsma.matriz.negocio.especificacao.Vetor3x1;

public class Matriz implements Matriz3x3  {
	private double numbers[][] = new double[3][3];

	public double[][] getNumbers() {
		return numbers;
	}

	public void setNumbers(double numbers[][]) {
		this.numbers = numbers;
	}
	
	
	public Matriz(double a11, double a12, double a13, double a21, double a22, double a23, double a31, double a32, double a33) {
		// TODO Auto-generated constructor stub
		double newNumbers[][] = new double[3][3];
		newNumbers[0][0] = a11;
		newNumbers[0][1] = a12;
		newNumbers[0][2] = a13;
		newNumbers[1][0] = a21;
		newNumbers[1][1] = a22;
		newNumbers[1][2] = a23;
		newNumbers[2][0] = a31;
		newNumbers[2][1] = a32;
		newNumbers[2][2] = a33;
		
		setNumbers(newNumbers);
	}

	@Override
	public Matriz3x3 adiciona(Matriz3x3 matriz) {
		Matriz novaMatriz = new Matriz(getNumbers()[0][0] + matriz.getValor(0,0), getNumbers()[0][1] + matriz.getValor(0,1), getNumbers()[0][2] + matriz.getValor(0,2),
									   getNumbers()[1][0] + matriz.getValor(1,0), getNumbers()[1][1] + matriz.getValor(1,1), getNumbers()[1][2] + matriz.getValor(1,2),
									   getNumbers()[2][0] + matriz.getValor(2,0), getNumbers()[2][1] + matriz.getValor(2,1), getNumbers()[2][2] + matriz.getValor(2,2));
		
		return novaMatriz;
	}

	@Override
	public Matriz3x3 subtrai(Matriz3x3 matriz) {

		Matriz novaMatriz = new Matriz(getNumbers()[0][0] - matriz.getValor(0,0), getNumbers()[0][1] - matriz.getValor(0,1), getNumbers()[0][2] - matriz.getValor(0,2),
									   getNumbers()[1][0] - matriz.getValor(1,0), getNumbers()[1][1] - matriz.getValor(1,1), getNumbers()[1][2] - matriz.getValor(1,2),
									   getNumbers()[2][0] - matriz.getValor(2,0), getNumbers()[2][1] - matriz.getValor(2,1), getNumbers()[2][2] - matriz.getValor(2,2));
		return novaMatriz;
	}

	@Override
	public Matriz3x3 multiplica(Matriz3x3 matriz) {
		
		Matriz novaMatriz = new Matriz(getNumbers()[0][0] * matriz.getValor(0,0), getNumbers()[0][1] * matriz.getValor(0,1), getNumbers()[0][2] * matriz.getValor(0,2),
									   getNumbers()[1][0] * matriz.getValor(1,0), getNumbers()[1][1] * matriz.getValor(1,1), getNumbers()[1][2] * matriz.getValor(1,2),
									   getNumbers()[2][0] * matriz.getValor(2,0), getNumbers()[2][1] * matriz.getValor(2,1), getNumbers()[2][2] * matriz.getValor(2,2));
		
		return novaMatriz;
	}

	@Override
	public Vetor3x1 multiplica(Vetor3x1 vetor){
		Vetor novoVetor = new Vetor((getNumbers()[0][0] * vetor.getValor(0)) + (getNumbers()[0][1] * vetor.getValor(0)) + (getNumbers()[0][2] * vetor.getValor(0)),
									(getNumbers()[1][0] * vetor.getValor(1)) + (getNumbers()[1][1] * vetor.getValor(1)) + (getNumbers()[1][2] * vetor.getValor(1)),
									(getNumbers()[2][0] * vetor.getValor(2)) + (getNumbers()[2][1] * vetor.getValor(2)) + (getNumbers()[2][2] * vetor.getValor(2)));
		return novoVetor;
	}

	@Override
	public Matriz3x3 multiplica(double escalar) {
		Matriz novaMatriz = new Matriz(getNumbers()[0][0] * escalar, getNumbers()[0][1] * escalar, getNumbers()[0][2] * escalar,
		 							   getNumbers()[1][0] * escalar, getNumbers()[1][1] * escalar, getNumbers()[1][2] * escalar, 
									   getNumbers()[2][0] * escalar, getNumbers()[2][1] * escalar, getNumbers()[2][2] * escalar);
		
		return novaMatriz;
	}

	@Override
	public Matriz3x3 inversa() {
		double det = getDeterminante();
		double newNumbers[][] = new double[3][3];
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 3; ++j)
				newNumbers[i][j] = ((((getNumbers()[(j+1)%3][(i+1)%3] * getNumbers()[(j+2)%3][(i+2)%3]) - (getNumbers()[(j+1)%3][(i+2)%3] * getNumbers()[(j+2)%3][(i+1)%3]))/ det));
		}

		Matriz novaMatriz = new Matriz(newNumbers[0][0], newNumbers[0][1], newNumbers[0][2],
									   newNumbers[1][0], newNumbers[1][1], newNumbers[1][2],
									   newNumbers[2][0], newNumbers[2][1], newNumbers[2][2]);
		
		return novaMatriz;
	}

	@Override
	public Matriz3x3 transposta() {
		double newNumbers[][] = new double[3][3];
		newNumbers[0][0] = getNumbers()[0][0];
		newNumbers[1][1] = getNumbers()[1][1];
		newNumbers[2][2] = getNumbers()[2][2];

		newNumbers[0][1] = getNumbers()[1][0];
		newNumbers[0][2] = getNumbers()[2][0];
		newNumbers[1][2] = getNumbers()[2][1];
		
		newNumbers[1][0] = getNumbers()[0][1];
		newNumbers[2][0] = getNumbers()[0][2];
		newNumbers[2][1] = getNumbers()[1][2];

		Matriz novaMatriz = new Matriz(newNumbers[0][0], newNumbers[0][1], newNumbers[0][2],
									   newNumbers[1][0], newNumbers[1][1], newNumbers[1][2],
									   newNumbers[2][0], newNumbers[2][1], newNumbers[2][2]);
		
		return novaMatriz;
	}

	@Override
	public boolean isEscalar() {
		// TODO Auto-generated method stub
		if(getNumbers()[0][0] == getNumbers()[1][1] && getNumbers()[1][1] == getNumbers()[2][2]){
			return true;
		}
		return false;
	}

	@Override
	public boolean isDiagonal() {
		// TODO Auto-generated method stub
		if(getNumbers()[1][0] == 0 &&
		   getNumbers()[2][0] == 0 &&
		   getNumbers()[2][1] == 0 &&
		   getNumbers()[0][1] == 0 &&
		   getNumbers()[0][2] == 0 &&
		   getNumbers()[1][2] == 0){
			   return true;
		   }
		return false;
	}

	@Override
	public boolean isIguais(Matriz3x3 matriz) {
		// TODO Auto-generated method stub
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if(getNumbers()[i][j] != matriz.getValor(i, j)){
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public double getDeterminante() {
		double det = 0;
		
	    for(int i = 0; i < 3; i++) {
	        det = det + (getNumbers()[0][i] * (getNumbers()[1][(i+1)%3] * getNumbers()[2][(i+2)%3] - getNumbers()[1][(i+2)%3] * getNumbers()[2][(i+1)%3]));
	    }

		return det;
	}

	@Override
	public void imprime() {
		System.out.print("|  "+getNumbers()[0][0]+ " " +getNumbers()[1][0]+ " " +getNumbers()[2][0]+"  |");
		System.out.print("|  "+getNumbers()[0][1]+ " " +getNumbers()[1][1]+ " " +getNumbers()[2][1]+"  |");
		System.out.print("|  "+getNumbers()[0][2]+ " " +getNumbers()[1][2]+ " " +getNumbers()[2][2]+"  |");
	}

	@Override
	public double getValor(int linha, int coluna) {
		// TODO Auto-generated method stub
		if(linha == 0) {
			if(coluna == 0) {
				return getNumbers()[0][0];
			}
			if(coluna == 1) {
				return getNumbers()[0][1];
			}
			if(coluna == 2) {
				return getNumbers()[0][2];
			}
		}
		if(linha == 1) {
			if(coluna == 0) {
				return getNumbers()[1][0];
			}
			if(coluna == 1) {
				return getNumbers()[1][1];
			}
			if(coluna == 2) {
				return getNumbers()[1][2];
			}
		}
		if(linha == 2) {
			if(coluna == 0) {
				return getNumbers()[2][0];
			}
			if(coluna == 1) {
				return getNumbers()[2][1];
			}
			if(coluna == 2) {
				return getNumbers()[2][2];
			}
		}
		return 0;
	}

}

package br.com.fsma.matriz.negocio;

import br.com.fsma.matriz.negocio.especificacao.Vetor3x1;

public class Vetor implements Vetor3x1 {
	private double[] numbers = new double[3];
	
	public Vetor(double a11, double a12, double a13) {
		// TODO Auto-generated constructor stub
	}

	public double[] getNumbers() {
		return numbers;
	}

	public void setNumbers(double[] numbers) {
		this.numbers = numbers;
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.print("|  "+getNumbers()[0]+"  |");
		System.out.print("|  "+getNumbers()[1]+"  |");
		System.out.print("|  "+getNumbers()[2]+"  |");
	}

	@Override
	public double getValor(int linha) {
		// TODO Auto-generated method stub
		if(linha == 0) {
			return getNumbers()[0];
		}
		if(linha == 1) {
			return getNumbers()[1];
		}
		if(linha == 2) {
			return getNumbers()[2];
		}
		return 0;
	}

}

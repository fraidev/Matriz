package br.com.fsma.matriz.negocio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.fsma.matriz.negocio.especificacao.Matriz3x3;
import br.com.fsma.matriz.negocio.especificacao.Vetor3x1;

class MatrizTest {

	@Test
	void deveRetornarOsValoresDosElementosDaMatriz() {
		Matriz3x3 matriz = new Matriz(0.9f, 1.8f, 2.7f, 3.6f, 4.5f, 5.4f, 6.3f, 7.2f, 8.1f);  // Como será o construtor desta matriz ?
		
		assertEquals(0.9f, matriz.getValor(0,0) );
		assertEquals(1.8f, matriz.getValor(0,1) );
		assertEquals(2.7f, matriz.getValor(0,2) );
		assertEquals(3.6f, matriz.getValor(1,0) );
		assertEquals(4.5f, matriz.getValor(1,1) );
		assertEquals(5.4f, matriz.getValor(1,2) );
		assertEquals(6.3f, matriz.getValor(2,0) );
		assertEquals(7.2f, matriz.getValor(2,1) );
		assertEquals(8.1f, matriz.getValor(2,2) );
	}

	@Test
	void deveRetornarOsValoresDosElementosDaMatrizAoAdicionar() {
		Matriz3x3 matriz = new Matriz(0.9f, 1.8f, 2.7f, 3.6f, 4.5f, 5.4f, 6.3f, 7.2f, 8.1f);  
		Matriz3x3 matriz2 = new Matriz(1.2f, 3.2f, 1.7f, 2.1f, 2.3f, 4.4f, 7.3f, 1.2f, 2.1f);  
		
		Matriz3x3 novaMatriz = matriz.adiciona(matriz2);
		
		assertEquals(matriz.getValor(0, 0) + matriz2.getValor(0, 0), novaMatriz.getValor(0,0) );
		assertEquals(matriz.getValor(0, 1) + matriz2.getValor(0, 1), novaMatriz.getValor(0,1) );
		assertEquals(matriz.getValor(0, 2) + matriz2.getValor(0, 2), novaMatriz.getValor(0,2) );
		
		assertEquals(matriz.getValor(1, 0) + matriz2.getValor(1, 0), novaMatriz.getValor(1,0) );
		assertEquals(matriz.getValor(1, 1) + matriz2.getValor(1, 1), novaMatriz.getValor(1,1) );
		assertEquals(matriz.getValor(1, 2) + matriz2.getValor(1, 2), novaMatriz.getValor(1,2) );
		
		assertEquals(matriz.getValor(2, 0) + matriz2.getValor(2, 0), novaMatriz.getValor(2,0) );
		assertEquals(matriz.getValor(2, 1) + matriz2.getValor(2, 1), novaMatriz.getValor(2,1) );
		assertEquals(matriz.getValor(2, 2) + matriz2.getValor(2, 2), novaMatriz.getValor(2,2) );
	}

	@Test
	void deveRetornarOsValoresDosElementosDaMatrizAoSubtrair() {
		Matriz3x3 matriz = new Matriz(0.9f, 1.8f, 2.7f, 3.6f, 4.5f, 5.4f, 6.3f, 7.2f, 8.1f);  
		Matriz3x3 matriz2 = new Matriz(1.2f, 3.2f, 1.7f, 2.1f, 2.3f, 4.4f, 7.3f, 1.2f, 2.1f);  
		
		Matriz3x3 novaMatriz = matriz.subtrai(matriz2);
		
		assertEquals(matriz.getValor(0, 0) - matriz2.getValor(0, 0), novaMatriz.getValor(0,0) );
		assertEquals(matriz.getValor(0, 1) - matriz2.getValor(0, 1), novaMatriz.getValor(0,1) );
		assertEquals(matriz.getValor(0, 2) - matriz2.getValor(0, 2), novaMatriz.getValor(0,2) );
		
		assertEquals(matriz.getValor(1, 0) - matriz2.getValor(1, 0), novaMatriz.getValor(1,0) );
		assertEquals(matriz.getValor(1, 1) - matriz2.getValor(1, 1), novaMatriz.getValor(1,1) );
		assertEquals(matriz.getValor(1, 2) - matriz2.getValor(1, 2), novaMatriz.getValor(1,2) );
		
		assertEquals(matriz.getValor(2, 0) - matriz2.getValor(2, 0), novaMatriz.getValor(2,0) );
		assertEquals(matriz.getValor(2, 1) - matriz2.getValor(2, 1), novaMatriz.getValor(2,1) );
		assertEquals(matriz.getValor(2, 2) - matriz2.getValor(2, 2), novaMatriz.getValor(2,2) );
	}

	@Test
	void deveRetornarOsValoresDosElementosDaMatrizAoMultiplicar3x3() {
		Matriz3x3 matriz = new Matriz(0.9f, 1.8f, 2.7f, 3.6f, 4.5f, 5.4f, 6.3f, 7.2f, 8.1f);  
		Matriz3x3 matriz2 = new Matriz(1.2f, 3.2f, 1.7f, 2.1f, 2.3f, 4.4f, 7.3f, 1.2f, 2.1f);  
		
		Matriz3x3 novaMatriz = matriz.multiplica(matriz2);
		
		assertEquals(matriz.getValor(0, 0) * matriz2.getValor(0, 0), novaMatriz.getValor(0,0) );
		assertEquals(matriz.getValor(0, 1) * matriz2.getValor(0, 1), novaMatriz.getValor(0,1) );
		assertEquals(matriz.getValor(0, 2) * matriz2.getValor(0, 2), novaMatriz.getValor(0,2) );
		
		assertEquals(matriz.getValor(1, 0) * matriz2.getValor(1, 0), novaMatriz.getValor(1,0) );
		assertEquals(matriz.getValor(1, 1) * matriz2.getValor(1, 1), novaMatriz.getValor(1,1) );
		assertEquals(matriz.getValor(1, 2) * matriz2.getValor(1, 2), novaMatriz.getValor(1,2) );
		
		assertEquals(matriz.getValor(2, 0) * matriz2.getValor(2, 0), novaMatriz.getValor(2,0) );
		assertEquals(matriz.getValor(2, 1) * matriz2.getValor(2, 1), novaMatriz.getValor(2,1) );
		assertEquals(matriz.getValor(2, 2) * matriz2.getValor(2, 2), novaMatriz.getValor(2,2) );
	}

	@Test
	void deveRetornarOsValoresDosElementosDaMatrizAoMultiplicar3x1() {
		Matriz3x3 matriz = new Matriz(0.9f, 1.8f, 2.7f, 3.6f, 4.5f, 5.4f, 6.3f, 7.2f, 8.1f);  
		Vetor3x1 vetor = new Vetor(1.2f, 3.2f, 1.7f);  
		
		Vetor3x1 novaVetor = matriz.multiplica(vetor);
		
		assertEquals((matriz.getValor(0, 0) * vetor.getValor(0)) + (matriz.getValor(0, 1) * vetor.getValor(0)) + (matriz.getValor(0, 2) * vetor.getValor(0)), novaVetor.getValor(0) );
		assertEquals((matriz.getValor(1, 0) * vetor.getValor(1)) + (matriz.getValor(1, 1) * vetor.getValor(1)) + (matriz.getValor(1, 2) * vetor.getValor(1)), novaVetor.getValor(1) );
		assertEquals((matriz.getValor(2, 0) * vetor.getValor(2)) + (matriz.getValor(2, 1) * vetor.getValor(2)) + (matriz.getValor(2, 2) * vetor.getValor(2)), novaVetor.getValor(2) );
	}
	
	@Test
	void deveRetornarOsValoresDosElementosDaMatrizAoMultiplicarEscala() {
		Matriz3x3 matriz = new Matriz(0.9f, 1.8f, 2.7f, 3.6f, 4.5f, 5.4f, 6.3f, 7.2f, 8.1f);  
		
		Matriz3x3 novaMatriz = matriz.multiplica(1.1f);

		assertEquals(matriz.getValor(0, 0) * 1.1f, novaMatriz.getValor(0,0) );
		assertEquals(matriz.getValor(0, 1) * 1.1f, novaMatriz.getValor(0,1) );
		assertEquals(matriz.getValor(0, 2) * 1.1f, novaMatriz.getValor(0,2) );
		
		assertEquals(matriz.getValor(1, 0) * 1.1f, novaMatriz.getValor(1,0) );
		assertEquals(matriz.getValor(1, 1) * 1.1f, novaMatriz.getValor(1,1) );
		assertEquals(matriz.getValor(1, 2) * 1.1f, novaMatriz.getValor(1,2) );
		
		assertEquals(matriz.getValor(2, 0) * 1.1f, novaMatriz.getValor(2,0) );
		assertEquals(matriz.getValor(2, 1) * 1.1f, novaMatriz.getValor(2,1) );
		assertEquals(matriz.getValor(2, 2) * 1.1f, novaMatriz.getValor(2,2) );
	}

	
	@Test 
	void deveRetornarOsValoresDosElementosDaMatrizInversa() {
		Matriz3x3 matriz = new Matriz(1.0f, 2.0f, 3.0f, 0.0f, 1.0f, 4.0f, 5.0f, 6.0f, 0.0f);  
		Matriz3x3 novaMatriz = matriz.inversa();
		
		assertEquals(-24.0, novaMatriz.getValor(0,0) );
		assertEquals(18.0, novaMatriz.getValor(0,1) );
		assertEquals(5.0, novaMatriz.getValor(0,2) );
		
		assertEquals(20.0, novaMatriz.getValor(1,0) );
		assertEquals(-15.0, novaMatriz.getValor(1,1) );
		assertEquals(-4.0, novaMatriz.getValor(1,2) );
		
		assertEquals(-5.0, novaMatriz.getValor(2,0) );
		assertEquals(4.0, novaMatriz.getValor(2,1) );
		assertEquals(1.0, novaMatriz.getValor(2,2) );

	}
	

	@Test
	void deveRetornarVerdadeiroSeAsMatrizesForemIguais() {
		Matriz3x3 matriz = new Matriz(0.9f, 1.8f, 2.7f, 3.6f, 4.5f, 5.4f, 6.3f, 7.2f, 8.1f);  
		Matriz3x3 matriz2 = new Matriz(0.9f, 1.8f, 2.7f, 3.6f, 4.5f, 5.4f, 6.3f, 7.2f, 8.1f);  
		Matriz3x3 matriz3 = new Matriz(1.2f, 3.2f, 1.7f, 2.1f, 2.3f, 4.4f, 7.3f, 1.2f, 2.1f);  
		
		boolean isIguais = matriz.isIguais(matriz2);
		boolean isNotIguais = matriz.isIguais(matriz3);

		assertEquals(true, isIguais );
		assertEquals(false, isNotIguais );
	}
	
	@Test
	void deveRetornarODeterminanteDaMatriz() {
		Matriz3x3 matriz = new Matriz(1.0f, 2.0f, 3.0f, 0.0f, 1.0f, 4.0f, 5.0f, 6.0f, 0.0f);  
		double determinante = matriz.getDeterminante();

		assertEquals(1, determinante);
	}
}
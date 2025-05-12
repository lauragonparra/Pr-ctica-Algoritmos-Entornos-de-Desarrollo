package com.entornos.nombreCompleto.algoritmos;

public class Principal {

	public static void main(String[] args) {
		int[] array = new int[3];
		boolean funciona = false;
		// 1
		do {
			array[0] = (int)(Math.random()*(10 - 2 + 1 ) + 2);
			array[1] = (int)(Math.random()*(10 - 2 + 1 ) + 2);
			array[2] = (int)(Math.random()*(10 - 2 + 1 ) + 2);
			
			if(array[0] != array[1] && array[2] != array[1] && array[2] != array[0]) {
					funciona = true;
			
			}
			
		}while(!funciona);
		
		Algoritmos prueba = new Algoritmos() {};

		//2
		int[] resultadoFibonacci = new int[3];
		for (int i = 0 ; i < 3 ; i++) {
			resultadoFibonacci[i] = prueba.fibonacci(array[i]);
		}
		
		//3
		int[] resultadoFactorial = new int[3];
		for (int i = 0 ; i < 3 ; i++) {
			resultadoFactorial[i] = prueba.factorial(array[i]);
		}
		
		//4
		boolean[] resultadoPrimos = new boolean[3];
		for (int i = 0 ; i < 3 ; i++) {
			resultadoPrimos[i] = prueba.primo(array[i]);
		}
		
		
		
		
	}

}

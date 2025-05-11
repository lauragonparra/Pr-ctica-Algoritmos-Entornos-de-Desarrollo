package com.entornos.nombreCompleto.algoritmos;

public abstract class Algoritmos {
	public int fibonacci (int numero) {
		int res = 0;
		int prim = 0;
		int otro = 1;
		for(int i = 2 ; i < numero + 1 ; i++) {
			 	
				res = prim + otro;
				prim = otro;
				otro = res;
		}
		
		if(numero < 2) {
			return numero;
		}
		return res;
	}
}

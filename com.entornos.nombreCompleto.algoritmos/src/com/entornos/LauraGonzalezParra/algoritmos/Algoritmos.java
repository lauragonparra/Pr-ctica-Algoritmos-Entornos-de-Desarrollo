package com.entornos.nombreCompleto.algoritmos;
/**
 * 
 * @author Laura
 * 
 */
public abstract class Algoritmos {
	
	public Algoritmos() {
		
	}
	
	/**
	 * Metodo que calcula el fibonacci de un numero recibido por parametro.
	 * Si el numero es inferior a cero se lanza una excepcion
	 * 
	 * @param numero	numero del que calculamos fibonacci
	 * @return			resultado del calculo
	 */
	public int fibonacci(int numero) {

		if (numero < 0) {
			throw new IllegalArgumentException("Parámetro inválido");
		}

		int res = 0;
		int prim = 0;
		int otro = 1;
		for (int i = 2; i < numero + 1; i++) {

			res = prim + otro;
			prim = otro;
			otro = res;
		}

		if (numero < 2) {
			return numero;
		}
		return res;
	}

	/**
	 * Metodo que calcula el factorial del numero recibido por parametro.
	 * Si el numero es inferior a cero se lanza una excepcion
	 * 
	 * @param numero	numero del que calculamos fibonacci
	 * @return			resultado del calculo
	 */
	public int factorial(int numero) {

		if (numero < 0) {
			throw new IllegalArgumentException("Parámetro inválido");
		}

		int res = 1;
		for (int i = 1; i <= numero; i++) {
			res = res * i;
		}
		return res;
	}
	
	/**
	 * Metodo que comprueba si el numero recibido por parametro es primo o no.
	 * Si el numero es inferior a cero se lanza una excepcion
	 * 
	 * @param numero	numero que comprobamos si es primo o no
	 * @return			devuelve un booleano que confirma o niega si es primo.
	 */
	public boolean primo(int numero) {
		
		if (numero < 2) {
			throw new IllegalArgumentException("Parámetro inválido");
		}
		
		int mitad = (int)numero/2;
		for (int i = 2 ; i < mitad ; i++) {
			if(numero % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
}

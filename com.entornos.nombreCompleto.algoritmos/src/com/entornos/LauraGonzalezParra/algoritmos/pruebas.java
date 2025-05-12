package com.entornos.nombreCompleto.algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class pruebas {
	static Algoritmos prueba;
	
	@BeforeAll
	static void setup(){
		prueba = new Algoritmos(){};
	}
		
	@Test
	void testFibonacci() {
		int fibonacciEsperado = 13;
		int fibonacciObtenido = prueba.fibonacci(7);
		assertEquals(fibonacciEsperado, fibonacciObtenido);
	}
	
	@Test
	void testExcepcionFibonacci() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
				() -> prueba.fibonacci(-1));
		
		String mensajeEsperado = "Parámetro inválido";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	
	
	
	@Test 
	void testFactorial(){
		int factorialEsperado = 5040;
		int factorialObtenido = prueba.factorial(7);
		assertEquals(factorialEsperado, factorialObtenido);
	}
	
	@Test
	void testExcepcionFactorial() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
				() -> prueba.factorial(-1));
		
		
		String mensajeEsperado = "Parámetro inválido";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	
	@Test
	void testPrimo(){
		boolean primoEsperado = true;
		boolean primoObtenido = prueba.primo(7);
		assertEquals(primoEsperado, primoObtenido);
	}
	
	@Test
	void testExcepcionPrimo() {
		Exception excepcion = assertThrows(IllegalArgumentException.class, 
				() -> prueba.primo(-1));
		
		
		String mensajeEsperado = "Parámetro inválido";
		String mensajeObtenido = excepcion.getMessage();
		assertEquals(mensajeEsperado, mensajeObtenido);
	}
	
	

}

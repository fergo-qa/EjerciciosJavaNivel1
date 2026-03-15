package Bloque3;

public class SobrecargaDeMétodosOverloading {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear dos métodos con el mismo nombre 'multiplicar'.
        Uno debe recibir dos enteros y el otro tres enteros.
        */
		
		System.out.println("Multiplicar 2 números: " + multiplicar(5,4));
		System.out.println("Multiplicar 3 números: " + multiplicar(5,4,2));
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	
	public static int multiplicar(int a, int b, int c) {
		return a * b * c;
	}
	
	/*
    EXPLICACIÓN
    - Java permite tener dos métodos con el mismo nombre siempre y cuando 
      tengan diferente cantidad o tipo de parámetros. 
    - Esto se llama Sobrecarga. El programa decide cuál usar según los datos que le pases.
    */

}

package Bloque2;

public class BucleForConCondicionalNúmerosPares {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Imprimir todos los números pares que se encuentran entre el 1 y el 20.
        */
		
		System.out.println("Número pares entre 1 y 20: ");
		
		for(int i = 1; i <= 20; i++) {
			// Si el resto de la división por 2 es cero, es par.
			if(i % 2 == 0) {
				System.out.println( i + " es par.");
			}
		}
		
		/*
        EXPLICACIÓN
        - Un bucle puede contener cualquier otra estructura dentro (if, switch, u otro bucle).
        - Aquí el bucle recorre todos los números, pero el 'if' filtra cuáles se imprimen.
        */
		
	}

}

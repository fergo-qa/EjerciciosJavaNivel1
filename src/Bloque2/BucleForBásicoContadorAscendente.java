package Bloque2;

public class BucleForBásicoContadorAscendente {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Escribir un programa que imprima los números del 1 al 10 
        utilizando un bucle 'for'.
        */
		
		System.out.println("Iniciando cuenta:");
		
		// Estructura: (inicio; condición; incremento)
		for(int i = 1; i <= 10; i++) {
			System.out.println("Número: " + i);
		}
		
		System.out.println("¡Cuenta terminada!");
		
		/*
        EXPLICACIÓN
        - El bucle 'for' se usa cuando sabemos de antemano cuántas veces queremos repetir algo.
        - 'int i = 1' es la variable de control (el contador).
        - 'i <= 10' es la condición: el bucle sigue mientras esto sea cierto.
        - 'i++' aumenta el contador en 1 al final de cada vuelta.
        */
		
	}

}

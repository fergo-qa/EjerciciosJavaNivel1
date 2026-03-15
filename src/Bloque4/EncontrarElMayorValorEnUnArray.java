package Bloque4;

public class EncontrarElMayorValorEnUnArray {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Dado un Array de números enteros, encontrar e imprimir cuál es el número mayor.
        */
		
		int[] numeros = {45,12,89,34,100,3};
		
		// Asumimos al principio que el mayor es el primer número.
		int numeroMayor = numeros[0];
		
		// Empezamos a comparar desde la posición.
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i] > numeroMayor) {
				numeroMayor = numeros[i]; // Actualizamos el mayor si encontramos uno más grande.
			}
		}
		
		System.out.println("El número mayor en el array es: " + numeroMayor);
		
		/*
        EXPLICACIÓN
        - El truco aquí es guardar el primer elemento como punto de referencia.
        - Luego recorremos el resto del Array. Si encontramos un número que supera a nuestra referencia, 
          actualizamos nuestra variable 'numeroMayor'. Al terminar el bucle, tendremos el valor máximo.
        */
		
	}

}

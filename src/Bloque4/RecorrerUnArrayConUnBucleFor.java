package Bloque4;

public class RecorrerUnArrayConUnBucleFor {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un Array con 4 notas de exámenes.
        Utilizar un bucle 'for' para imprimir todas las notas una por una.
        */
		
		double[] notas = {8.5,9.0,7.5,10.0};
		
		System.out.println("Listado de notas:");
		
		// El bucle empieza en 0 y termina antes de llegar al tamaño total del array.
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
		
		/*
        EXPLICACIÓN
        - Esta es la combinación más poderosa en programación: Bucles + Arrays.
        - Usamos la variable 'i' del bucle como el índice del Array: 'notas[i]'.
        - En la primera vuelta 'i' es 0 (imprime notas[0]), en la segunda es 1 (imprime notas[1]), etc.
        - Usamos '< notas.length' (estrictamente menor) porque si el tamaño es 4, los índices válidos son 0, 1, 2 y 3.
        */
		
	}

}

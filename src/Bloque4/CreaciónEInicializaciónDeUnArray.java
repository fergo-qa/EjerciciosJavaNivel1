package Bloque4;

public class CreaciónEInicializaciónDeUnArray {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Declarar un Array de números enteros que contenga las edades de 5 personas.
        Imprimir la primera y la última edad del Array.
        */
		
		// Las llaves {} nos permiten inicializar el Array con valores directamente.
		int[] edades = {25,30,18,42,50};
		
		// En Java, las posiciones (índices) empiezan a contar desde el CERO.
		System.out.println("La primera edad es: " + edades[0]);
		System.out.println("La última edad es: "+ edades[4]);
	}
	
	/*
    EXPLICACIÓN
    - Un Array se declara poniendo corchetes '[]' después del tipo de dato.
    - Los elementos dentro del Array tienen un orden numérico llamado "índice" (index).
    - ¡Regla de oro!: El primer elemento siempre está en el índice 0. 
    - Si el array tiene 5 elementos, el último índice es el 4.
    */
	

}

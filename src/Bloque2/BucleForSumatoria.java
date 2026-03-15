package Bloque2;

public class BucleForSumatoria {

	public static void main(String[] args) {
		
		/*
        CONSIGNA
        Calcular la suma de todos los números del 1 al 100 
        e imprimir solo el resultado final.
        */
		
		int sumaTotal = 0;
		
		for(int i = 1; i <= 100; i++) {
			sumaTotal += i; // Sumamos el valor de 'i' al acumulador.
		}
		
		System.out.println("La suma de los números del 1 al 100 es: " + sumaTotal);
		
		/*
        EXPLICACIÓN
        - Usamos una variable 'acumuladora' (sumaTotal) que declaramos FUERA del bucle.
        - Si la declaráramos dentro, se borraría en cada vuelta. Al estar fuera, 
          guarda el progreso de la suma.
        */
		
	}

}

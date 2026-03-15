package Bloque2;

public class ContinueSaltarUnaIteración {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Imprimir los números del 1 al 5, pero saltarse el número 3.
        */
		
		for(int i = 1;i <= 5; i++) {
			if(i == 3) {
				System.out.println("Saltandp el número 3...");
				continue; // Salta a la siguiente vuelta del bucle.
			}
			
			System.out.println("Número: " + i);
			
		}
		
		/*
        EXPLICACIÓN
        - A diferencia de 'break', 'continue' no detiene el bucle.
        - Simplemente dice: "Ignora el código que falta en ESTA vuelta y pasa a la siguiente".
        - Por eso el número 3 no llega a imprimirse en la línea 'System.out.println("Número: " + i);'.
        */
		
	}

}

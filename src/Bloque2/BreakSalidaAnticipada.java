package Bloque2;

public class BreakSalidaAnticipada {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Buscar el número 7 en un bucle que va del 1 al 10. 
        Cuando se encuentre, imprimir un mensaje y detener el bucle inmediatamente.
        */
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Buscando... número actual: " + i);
			
			if (i == 7) {
				System.out.println("¡Número 7 encontrado! Cancelando búsqueda.");
				break; // Rompe el bucle y sale de él.
			}
		}
		
		/*
        EXPLICACIÓN
        - La palabra clave 'break' detiene el bucle por completo, sin importar 
          si la condición inicial todavía era verdadera. 
        - Es muy útil para optimizar código: si ya encontraste lo que buscabas, 
          no tiene sentido seguir dando vueltas.
        */
		
	}

}

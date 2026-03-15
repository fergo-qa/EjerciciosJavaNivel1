package Bloque2;

public class BucleWhileContadorDeSeguridad {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Realizar un contador del 10 al 1 (cuenta regresiva) 
        utilizando el bucle 'while'.
        */
		
		int contador = 10;
		
		while(contador >= 1) {
			System.out.println("Cuenta regresiva: " + contador);
			contador--; // IMPORTANTE: Restamos 1 para que la condición sea falsa eventualmente
		}
		
		System.out.println("¡Despegue!");
		
		/*
        EXPLICACIÓN
        - El bucle 'while' se usa cuando no sabemos exactamente cuántas vueltas dará, 
          sino que depende de una condición.
        - ¡CUIDADO!: Si olvidas el 'contador--', el bucle será infinito y tu programa se trabará.
        */
		
	}

}

package Bloque1;

public class ReasignaciónEIncremento {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Simular el puntaje de un jugador en un videojuego.
        El jugador empieza con 0 puntos. Luego gana 10 puntos, después pierde 3 puntos, 
        y finalmente gana 1 punto extra. Imprimir el puntaje final.
        */
		
		int puntaje = 0;
		System.out.println("Puntaje inicial: " + puntaje);
		
		puntaje = puntaje + 10; // Gana 10 puntos.
		System.out.println("Ganó 10 puntos. Puntaje actual: " + puntaje);
		
		puntaje -= 3; // Pierde 3 puntos. (Forma abreviada de puntaje = puntaje = -3)
		System.out.println("Perdió 3 puntos. Puntaje actual: " + puntaje);
		
		puntaje++; // Gana 1 punto. (Operador de incremento, suma exactamente 1)
		System.out.println("Ganó 1 punto extra. Puntaje final: " + puntaje);
		
		/*
        EXPLICACIÓN
        - Las variables se llaman "variables" porque su valor puede cambiar durante la ejecución del programa.
        - Para cambiar el valor, simplemente volvemos a usar el nombre de la variable (sin poner el tipo 'int' de nuevo) y le asignamos el nuevo valor usando '='.
        - '++' es un operador muy común que incrementa el valor numérico en exactamente 1.
        */
		
	}

}

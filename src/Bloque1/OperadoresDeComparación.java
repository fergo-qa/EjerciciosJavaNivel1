package Bloque1;

public class OperadoresDeComparación {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear una variable con la edad de una persona.
        Comparar si la edad es mayor o igual a 18 y guardar el resultado en una variable booleana.
        Imprimir si la persona es mayor de edad.
        */
		
		int edadPersona = 20;
		int mayoriaDeEdad = 18;
		
		//Comparamos usando el operador >= (Mayor o igual)
		boolean esMayor = edadPersona >= mayoriaDeEdad;
		
		System.out.println("La edad de la persona es: " + edadPersona);
		System.out.println("¿Es mayor de edad?: " + esMayor);
		
		/*
        EXPLICACIÓN
        - Los operadores de comparación evalúan dos valores y SIEMPRE devuelven un 'boolean' (true o false).
        - Los más comunes son: == (igual a), != (distinto de), > (mayor que), < (menor que), 
          >= (mayor o igual), <= (menor o igual).
        */
		
	}

}

package Bloque3;

public class MétodoConParámetros {

	public static void main(String[] args) {

		/*
		CONSIGNA
        Crear un método que reciba un nombre como parámetro e imprima 
        un saludo personalizado.
        */
		
		saludoPersonalizado("Cristian");
		saludoPersonalizado("Laura");
        
	}
	
	// El método recibe una variable String llamada 'nombre'
	public static void saludoPersonalizado(String nombre) {
		System.out.println("¡Hola, " + nombre + "! Bienvenido a Java.");
	}
	
	/*
    EXPLICACIÓN
    - Los parámetros son variables que el método necesita para funcionar. 
    - Se definen entre los paréntesis: (Tipo nombreVariable).
    - Al llamar al método, debemos pasarle un valor del mismo tipo.
    */
	

}

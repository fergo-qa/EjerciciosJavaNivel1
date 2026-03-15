package Bloque3;

public class MétodoSimpleSinParámetrosNiRetorno {

	// Este es nuestro método main, el punto de entrada
	public static void main(String[] args) {

		/*
		CONSIGNA
        Crear un método llamado 'saludar' que imprima un mensaje de bienvenida.
        Llamar al método tres veces desde el main.
        */
        
        System.out.println("Iniciando Programa...");
        
        //Llamaremos al método por su nombre seguido de paréntesis.
        saludar();
        saludar();
        saludar();
        
        System.out.println("Programa finalizado.");
	}
	
	// Definición del método fuera del main, pero dentro de la clase
	public static void saludar() {
		System.out.println("¡Hola! Soy un método ejecutándose.");
	}

	/*
    EXPLICACIÓN
    - 'public static void': Por ahora, usaremos estas palabras para que el main pueda verlo.
    - 'void': Significa que el método realiza una acción pero no devuelve ningún dato.
    - Los métodos nos permiten evitar repetir código. Si quisiéramos cambiar el saludo, 
      solo lo haríamos en un lugar.
    */
	
}

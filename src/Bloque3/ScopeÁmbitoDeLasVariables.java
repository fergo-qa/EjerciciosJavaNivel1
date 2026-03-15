package Bloque3;

public class ScopeÁmbitoDeLasVariables {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Demostrar que una variable declarada dentro de un método 
        no existe fuera de él.
        */
		
		int numeroPrincipal = 100;
		intentarCambiarValor();
		
		System.out.println("El valor en el main sigue siendo: " + numeroPrincipal);
	}
	
	public static void intentarCambiarValor() {
		// Esta variable 'numeroPrincipal' es distinta a la del main.
		int numeroPrincipal = 0;
		System.out.println("Valor dentro del método: " + numeroPrincipal);
	}
	
	/*
    EXPLICACIÓN
    - Las variables creadas dentro de un método son "locales". 
    - Nacen cuando el método empieza y mueren cuando termina.
    - El 'main' no puede ver lo que hay dentro de otros métodos a menos que 
      se pase como parámetro o se devuelva con un return.
    */
	

}

package Bloque3;

public class MétodosQueLlamanOtrosMétodos {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un método para obtener el nombre completo y otro para 
        imprimir un formato de ficha.
        */
		
		mostrarFicha("Juan","Perez");
	}
	
	public static String obtenerNombreCompleto(String nombre, String apellido) {
		return nombre + " " + apellido;
	}
	
	public static void mostrarFicha(String n, String a) {
		String nombreFinal = obtenerNombreCompleto(n,a);
		
		System.out.println("***** FICHA DE USUARIO *****");
		System.out.println("Nombre: " + nombreFinal);
		System.out.println("****************************");
	}
	
	/*
    EXPLICACIÓN
    - Un método puede llamar a otro método. Esto ayuda a que cada 
      función tenga una responsabilidad única y pequeña.
    */
	

}

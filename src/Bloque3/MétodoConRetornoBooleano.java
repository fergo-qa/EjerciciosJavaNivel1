package Bloque3;

public class MétodoConRetornoBooleano {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un método llamado 'esAdulto' que reciba una edad y devuelva 
        true si es mayor o igual a 18, o false si no lo es.
        */
		
		int miEdad = 35;
		
		if(esAdulto(miEdad)) {
			System.out.println("Acceso concedido.");
		} else {
			System.out.println("Acceso denegado: Eres menor de edad.");
		}
	}
	
	public static boolean esAdulto(int edad) {
		return edad >= 18; // Esto devuelve directamente el resultado de la comparación.
	}

	/*
    EXPLICACIÓN
    - Los métodos que devuelven booleanos son muy útiles para limpiar los 'if'.
    - En lugar de poner condiciones complejas en el 'if', usamos un método que 
      "pregunte" por nosotros.
    */
	
}

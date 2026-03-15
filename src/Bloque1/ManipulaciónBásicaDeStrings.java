package Bloque1;

public class ManipulaciónBásicaDeStrings {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Dado el nombre completo de una persona en minúsculas, utilizar métodos 
        de la clase String para saber cuántas letras tiene, pasarlo a mayúsculas 
        y comprobar si contiene una letra específica.
        */
		
		String nombreCompleto = "Juan Diaz";
		
		// Obtener la longitud (cantidad de caracteres, incluyendo espacios)
		int cantidadLetras = nombreCompleto.length();
		
		// Convertir todo el texto a MAYÚSCULAS
		String nombreMayusculas = nombreCompleto.toUpperCase();
		
		// Verificar si contiene la letra "z"
		boolean contieneZ = nombreCompleto.contains("z");
				
		System.out.println("Nombre original: " + nombreCompleto);
		System.out.println("Cantidad de caracteres: " + cantidadLetras);
		System.out.println("Nombre en máyusculas: " + nombreMayusculas);
		System.out.println("¿Contiene la letra 'z'?: " + contieneZ);
		
		/*
        EXPLICACIÓN
        - En Java, 'String' no es un tipo primitivo, es un Objeto. Por eso tiene "métodos" integrados.
        - 'length()' cuenta los caracteres y devuelve un 'int'.
        - 'toUpperCase()' crea y devuelve una nueva versión del String pero en mayúsculas.
        - 'contains()' busca dentro del texto y devuelve un 'boolean'.
        */
		
	}

}

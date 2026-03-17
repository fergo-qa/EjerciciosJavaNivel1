package Bloque5;

public class PrimeraClaseYPrimerObjeto {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un "molde" (Clase) llamado Gato.
        Luego, en el main, crear ("instanciar") un objeto de esa clase 
        y asignarle un nombre.
        */

        // 1. Creamos el objeto usando la palabra clave 'new'
        Gato miPrimerGato = new Gato();
        
        // 2. Le damos valores a sus atributos (características)
        miPrimerGato.nombre = "Luna";
        miPrimerGato.edad = 2;

        System.out.println("Mi gato se llama " + miPrimerGato.nombre);
        System.out.println("Tiene " + miPrimerGato.edad + " años.");

        /*
        EXPLICACIÓN
        - Una 'Clase' (Gato) es solo un plano o molde. No ocupa espacio real ni tiene datos vivos.
        - Un 'Objeto' (miPrimerGato) es la materialización de ese molde. Se crea usando 'new'.
        - Con el punto '.' accedemos a las propiedades del objeto para leerlas o modificarlas.
        */
	}
}

//Esta es la CLASE (el molde). Fíjate que no lleva 'public' ni tiene método 'main'.
class Gato {
 // Atributos (Variables que pertenecen al objeto)
 String nombre;
 int edad;
}

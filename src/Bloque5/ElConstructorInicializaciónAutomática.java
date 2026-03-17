package Bloque5;

public class ElConstructorInicializaciónAutomática {

	public static void main(String[] args) {
		/*
        CONSIGNA
        Crear una clase 'Libro'. En lugar de asignar sus atributos uno por uno en el main,
        usar un Constructor para darle los valores en el mismo momento en que se crea el objeto.
        */

        // Pasamos los datos directamente en los paréntesis al hacer el 'new'
        Libro libro1 = new Libro("1984", "George Orwell");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry");

        libro1.mostrarInfo();
        libro2.mostrarInfo();

        /*
        EXPLICACIÓN
        - El Constructor es un método especial que se ejecuta automáticamente cuando haces 'new'.
        - SIEMPRE se llama exactamente igual que la Clase y NO tiene tipo de retorno (ni void).
        - Nos ahorra escribir múltiples líneas de código para inicializar un objeto.
        */
        
	}
}

class Libro {
    String titulo;
    String autor;

    // CONSTRUCTOR
    Libro(String tituloLibro, String autorLibro) {
        titulo = tituloLibro;
        autor = autorLibro;
    }

    void mostrarInfo() {
        System.out.println("Libro: '" + titulo + "' escrito por " + autor);
    }
}

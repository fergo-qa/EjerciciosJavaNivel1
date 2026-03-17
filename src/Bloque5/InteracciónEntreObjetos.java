package Bloque5;

public class InteracciónEntreObjetos {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear dos objetos 'Jugador'. Hacer que uno ataque al otro, disminuyendo 
        su vida usando métodos e interactuando entre sí.
        */

        Jugador guerrero = new Jugador("Thor", 100);
        Jugador mago = new Jugador("Loki", 80);

        System.out.println("--- ESTADO INICIAL ---");
        guerrero.mostrarEstado();
        mago.mostrarEstado();

        System.out.println("\n--- ¡BATALLA! ---");
        // El guerrero ataca al mago, causándole 25 de daño
        guerrero.atacar(mago, 25);

        System.out.println("\n--- ESTADO FINAL ---");
        guerrero.mostrarEstado();
        mago.mostrarEstado();

        /*
        EXPLICACIÓN FINAL
        - ¡Aquí todo cobra sentido! Un método en un objeto (guerrero) recibe como parámetro 
          a OTRO objeto entero (mago).
        - El guerrero modifica el estado interno del mago a través de sus métodos.
        - Así es como funcionan los videojuegos, las aplicaciones bancarias y las redes sociales: 
          Son cientos de Objetos interactuando entre sí en la memoria.
        */
    }
}

class Jugador {
    private String nombre;
    private int puntosDeVida;

    Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.puntosDeVida = vida;
    }

    public void recibirDanio(int cantidad) {
        this.puntosDeVida -= cantidad;
        if (this.puntosDeVida < 0) this.puntosDeVida = 0;
    }

    // Este método es mágico: recibe a otro Jugador como víctima
    public void atacar(Jugador enemigo, int danio) {
        System.out.println(this.nombre + " ataca a " + enemigo.nombre + " causando " + danio + " de daño!");
        enemigo.recibirDanio(danio); // Modificamos al objeto enemigo
    }

    public void mostrarEstado() {
        System.out.println("Jugador: " + this.nombre + " | HP: " + this.puntosDeVida);
    }
}

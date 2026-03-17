package Bloque5;

public class LaPalabraReservadaThis {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear una clase 'Usuario'. Utilizar la palabra reservada 'this' en su constructor 
        para diferenciar los atributos de la clase de los parámetros del constructor.
        */

        Usuario user = new Usuario("jperez", "juan@mail.com");
        user.imprimirPerfil();

        /*
        EXPLICACIÓN
        - En el mundo real, los parámetros del constructor se suelen llamar igual que los atributos.
        - 'this.username' significa: "El atributo 'username' de ESTE objeto en específico".
        - 'username' (sin this) significa: "El parámetro que me acaban de pasar por el paréntesis".
        - Esto evita confusiones en Java cuando los nombres son idénticos.
        */
	}
}
	class Usuario {
	    String username;
	    String email;

	    // Los parámetros se llaman igual que los atributos
	    Usuario(String username, String email) {
	        this.username = username; // El atributo = El parámetro
	        this.email = email;
	    }

	    void imprimirPerfil() {
	        System.out.println("Usuario: " + this.username + " | Email: " + this.email);
	    }
	}

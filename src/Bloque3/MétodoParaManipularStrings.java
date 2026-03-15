package Bloque3;

public class MétodoParaManipularStrings {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear un método que reciba un email y devuelva true 
        si contiene un '@' y termina en '.com'.
        */
		
		String miEmail = "curso.java@ejemplo.com";
		System.out.println("¿Es el email válido?: " + validarEmail(miEmail));
	}
	
	public static boolean validarEmail(String email) {
		return email.contains("@") && email.endsWith(".com");
	}

	/*
    EXPLICACIÓN
    - Aquí usamos métodos de la clase String (.contains y .endsWith) 
      dentro de nuestro propio método lógico.
    */
	
}

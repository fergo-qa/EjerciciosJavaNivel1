package Bloque1;

public class VariablesYTiposDeDatosPrimitivos {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Crear variables de diferentes tipos (String, int, double, char, boolean) 
        para almacenar los datos del perfil de un usuario. Luego, imprimir esos datos.
        */
		
		String nombre = "Fernando";
		int edad = 28;
		double altura = 1.85;
		char inicial = 'F';
		boolean esEstudiante = true;
		
		System.out.println("Perfil del Usuario");
		System.out.println("***************************");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad + " años");
		System.out.println("Altura: " + altura + " metros");
		System.out.println("Inicial: " + inicial);
		System.out.println("¿Es estudiante?: " + esEstudiante);
	}

}

package Bloque2;

public class BucleWhileCondiciónPorBanderaBoolean {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Simular un sistema que intenta conectar a un servidor. 
        En cada intento (vuelta), se imprime el número de intento. 
        El bucle debe detenerse cuando 'conectado' sea true.
        */
		
		boolean conectado = false;
		int intentos = 1;
		
		while (!conectado) { // Se lee: "Mientras NO esté conectado"
			System.out.println("Intento de conexión número: " + intentos);
			
			// Simulamos que al tercer intento se conecta
			if(intentos == 3) {
				conectado = true;
			}
			
			intentos++;
			
		}
		
		System.out.println("Sistema conectado exitosamente.");
		
		/*
        EXPLICACIÓN
        - Una "bandera" (flag) es una variable booleana que controla el flujo.
        - El bucle revisa la variable en cada vuelta. Al cambiar a 'true', 
          la condición '!conectado' se vuelve falsa y el bucle termina.
        */
		
	}

}

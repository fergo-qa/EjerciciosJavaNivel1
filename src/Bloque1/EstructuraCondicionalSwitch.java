package Bloque1;

public class EstructuraCondicionalSwitch {

	public static void main(String[] args) {

		/*
        CONSIGNA
        Dado un número del 1 al 7 que representa un día de la semana (1 = Lunes),
        utilizar un switch para imprimir el nombre del día correspondiente.
        */
		
		int diaSemana = 5;
		
		switch(diaSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Número inválido. Debe ser entre 1 y 7.");
		}
		
		/*
        EXPLICACIÓN
        - 'switch' se utiliza cuando tenemos una variable y queremos evaluar casos específicos y exactos (1, 2, 3...), en lugar de rangos (> 10).
        - La palabra clave 'break' es obligatoria al final de cada 'case' para evitar que el programa siga ejecutando los días siguientes.
        - 'default' se ejecuta si la variable no coincide con ninguno de los casos programados.
        */
		
		
	}

}

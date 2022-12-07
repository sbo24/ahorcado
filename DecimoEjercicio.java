package ejerciciosstrringystringbuilder;

import java.util.Iterator;
import java.util.Scanner;

public class DecimoEjercicio {

	public static void main(String[] args) {
		// Juego del ahorcado

		Scanner teclado= new Scanner(System.in);
		System.out.print("teclea una frase ");
		String frase = teclado.nextLine();
		System.out.print("teclea una letra ");
		String letra = teclado.nextLine();
		int contador=0;

		String palabrafinal="";

		String letras="";

		for (int i = 0; i<8 ; i++) {

				letras=letras+letra;
				palabrafinal = frase.replaceAll("[^ "+letras+"]","-");
				System.err.println(palabrafinal);
				
				if (frase.equals(palabrafinal)) {
					System.err.println("HAS ACERTADO");
					i=8;
					break;
				}
				
				contador++;
				if (contador==8) {
					System.out.print("TE HAS QUEDADO SIN MAS INTENTOS");
				}

				System.out.print("teclea una otra letra ");
				letra = teclado.nextLine();
		
			
			
		
		}


	}

}

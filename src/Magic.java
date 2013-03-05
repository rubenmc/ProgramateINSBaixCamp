import java.util.*;
/**
 * 	Comprueba si el numero introducido es magico o no, un numero es magico cuando:
 * 		Tiene numeros impares en las zonas impares
 * 		Tiene numeros pares en las zonas pares
 * 
 * 
 *	1232 --> Numero magic
 *	2123 --> Numero no magic 
 *
 *No se tiene que testear en el juez
 * 
 */

public class Magic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] number;
		String numero;
		boolean incorrecte = false;
		System.out.println("Enter");
		//Recogemos valores
		numero = scan.nextLine();
		number = numero.toCharArray();
		//Bucle para comprovar posicion por posicion
		for (int x = 0; x < number.length; x++) {
			//Comprobar numero par en posicion par
			if (Character.getNumericValue(number[x]) % 2 != 0
					&& (x + 1) % 2 == 0) {
				incorrecte = true;
			//Comprobar numero inpar en posicion inpar
			} else if (Character.getNumericValue(number[x]) % 2 == 0
					&& (x + 1) % 2 != 0) {
				incorrecte = true;
			}
		}
		//Imprime el mensaje dependiendo si ha habido errores o no
		if (!incorrecte) {
			System.out.println("It's maaaaagiiiiiiic");
		}else{
			System.out.println("Del monton");
		}

		scan.close();

	}

}

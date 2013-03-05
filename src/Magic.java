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
 */

public class Magic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] number;
		String numero;
		boolean incorrecte = false;
		System.out.println("Enter");

		numero = scan.nextLine();
		number = numero.toCharArray();

		for (int x = 0; x < number.length; x++) {
			if (Character.getNumericValue(number[x]) % 2 != 0
					&& (x + 1) % 2 == 0) {
				incorrecte = true;
				//System.out.println("Impar en zona par");
			} else if (Character.getNumericValue(number[x]) % 2 == 0
					&& (x + 1) % 2 != 0) {
				incorrecte = true;
				//System.out.println("Par en zona impar");
			}
		}

		if (!incorrecte) {
			System.out.println("It's maaaaagiiiiiiic");
		}else{
			System.out.println("Del monton");
		}

		scan.close();

	}

}

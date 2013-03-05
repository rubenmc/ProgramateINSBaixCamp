import java.util.Scanner;

/**
 * Piramide de numeros
 * 
 * Ejemplo: 6x6
 * 333333
 * 322223
 * 321123
 * 321123
 * 322223
 * 333333
 * 
 * No se tiene que testear en el juez
 */
public class Piramide {

	public static void main(String[] args) {
		Integer[][] piramide;
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int numero, col_ini = 0, col_fin = x - 1, fil_ini = 0, fil_fin = y - 1;

		// Calcular niveles
		if (x > y) {
			numero = (int) Math.ceil((double) y / 2);
		} else if (y > x) {
			numero = (int) Math.ceil((double) x / 2);
		} else {
			numero = (int) Math.ceil((double) x / 2);
		}

		piramide = new Integer[y][x];
		//Bucle para rellenar la matriz
		while (numero > 0) {

			for (int i = fil_ini; i <= fil_fin; i++) {
				for (int j = col_ini; j <= col_fin; j++) {
					piramide[i][j] = numero;
				}
			}
			//Ajustamos limites
			numero--;
			col_ini++;
			col_fin--;
			fil_ini++;
			fil_fin--;
		}
		//Imprimimos la tabla
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(piramide[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}

}

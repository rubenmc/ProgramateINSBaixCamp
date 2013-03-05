import java.util.Scanner;

/**
 * 35--71 20--44 10--26 0---nada
 */

public class Romanos {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int soldados;
		int soldadosRestantes;
		int escudos = 0;
		int numCuadrados = 1;
		boolean max = false;

		soldados = Integer.parseInt(keyboard.nextLine());
		while (soldados > 0) {
			soldadosRestantes = soldados;
			while (soldadosRestantes > 0) {
				while (!max) {
					if (soldadosRestantes < (numCuadrados * numCuadrados)) {
						numCuadrados--;
						max = true;
					} else {
						numCuadrados++;
					}
				}
				max = false;
				soldadosRestantes -= (numCuadrados * numCuadrados);
				escudos += (numCuadrados * numCuadrados) + (numCuadrados * 4);
				numCuadrados = 1;
			}
			soldados = Integer.parseInt(keyboard.nextLine().trim());
			System.out.println(escudos);
			escudos = 0;
		}
		keyboard.close();
	}
}

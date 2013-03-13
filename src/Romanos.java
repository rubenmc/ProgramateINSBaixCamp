import java.util.Scanner;

/**
 * Casos de prueba
 * Valor	Resultado
 * 35---------71
 * 20---------44
 * 10---------26
 * 0----------nada
 * 
 * Testeado en el juez, Correcto.
 */

public class Romanos {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int soldados;
		int soldadosRestantes;
		int escudos = 0;
		int numCuadrados = 1;
		boolean max = false;
		//Leemos numero de soldados
		soldados = Integer.parseInt(keyboard.nextLine());
		while (soldados > 0) { //Bucle que se ejecutara hasta quedarnos sin soldados
			soldadosRestantes = soldados;
			while (soldadosRestantes > 0) {
				while (!max) {
					//Calculamos el cuadrado mas grande posible que podemos hacer
					if (soldadosRestantes < (numCuadrados * numCuadrados)) {
						numCuadrados--;
						max = true;
					} else {
						numCuadrados++;
					}
				}
				max = false;
				//restamos los soldados que utilizamos para el cuadrado a los restantes
				soldadosRestantes -= (numCuadrados * numCuadrados);
				//calculamos los escudos necesarios para ese cuadrado
				escudos += (numCuadrados * numCuadrados) + (numCuadrados * 4);
				numCuadrados = 1;
			}
			//Leemos siguiente numeros de soldados
			soldados = Integer.parseInt(keyboard.nextLine().trim());
			//Imprimimos total de escudos necesarios
			System.out.println(escudos);
			//Reiniciamos los escudos
			escudos = 0;
		}
		keyboard.close();
	}
}
// añado comentario para ordenar

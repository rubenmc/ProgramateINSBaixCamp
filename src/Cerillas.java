import java.util.Scanner;

public class Cerillas {

	/**
	 * Da RUN-ERROR
	 * Tanto en lectura infinita como en lectura hasta perder da error
	 * Estaria bien saber el caso en el que falla
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, max;
		boolean sortida = false;
		// Bucle infinito mientras nos metan datos
		while (!sortida) {
			// recumeramos valores
			num = Integer.parseInt(scan.next());
			max = Integer.parseInt(scan.next());
			//Si solo queda una perdemos
			if (num == 1) {
				System.out.println("PIERDO");
				sortida = true;
			} else {
				//Si quedan mas que el maximo + 1 retiramos solo 1
				if (num > max + 1) {
					System.out.println(1);
				//Si quedan el maximo + 1 o menos retiramos todas menos 1
				} else {
					System.out.println(num - 1);
				}
			}
		}
		scan.close();
	}

}
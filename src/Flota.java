import java.util.Scanner;

public class Flota {

	/**
	 * Ha de comprovar si la disposicion del tablero es correcta
	 * 
	 * Da wrong answer
	 */
	static int taula[][];
	static boolean error = false;
	static int mida;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int z;
		boolean trobat = false;
		// Obtener tamaño de la flota
		int[] flota = new int[Integer.parseInt(scan.next())];
		while (flota.length > 0) {
			error = false;
			trobat = false;
			// Obtener tamaño de los barcos
			for (int j = 0; j < flota.length; j++) {
				flota[j] = Integer.parseInt(scan.next());
			}
			// Obtener tamaño del tablero
			mida = Integer.parseInt(scan.next());
			taula = new int[mida][mida];
			// Obtener disposicion del tablero
			for (int x = 0; x < mida; x++) {
				for (int y = 0; y < mida; y++) {
					taula[x][y] = Integer.parseInt(scan.next());
				}
			}
			if (mida == 1) {
				if (taula[0][0] == 0) {
					error = true;
				}
			}else {
			

				int llarg, x = 0, y = 0;
				while (x < mida && error != true) {
					while (y < mida && error != true) {
						trobat = false;
						if (taula[x][y] == 1) {
							llarg = comprovaPosicio(x, y);
							z = 0;
							// Buscar medida del barco en la flota
							while (!trobat && z < flota.length) {
								if (flota[z] == llarg) {
									flota[z] = 0;
									trobat = true;
								}
								z++;
							}
							// Si no lo encuentra indicamos el error
							if (!trobat) {
								error = true;
							}
						}
						y++;
					}
					x++;
					y = 0;
				}
			}
				// Mostramos mensaje
				if (!error) {
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
				error = false;
				flota = new int[Integer.parseInt(scan.next())];
			
		}

	}

	public static int comprovaPosicio(int x, int y) {
		boolean dreta = false, inferior = false, inferiordreta = false, inferioresquerra = false;

		// Comprovamos valor de los vecinos
		if (y < taula.length - 1) {
			if (taula[x][y + 1] == 1) {
				dreta = true;
			}
		}

		if (x < taula.length - 1 && y < taula.length - 1) {
			if (taula[x + 1][y + 1] == 1) {
				inferiordreta = true;
			}
		}

		if (x < taula.length - 1) {
			if (taula[x + 1][y] == 1) {
				inferior = true;
			}
		}
		if (y > 0 && x < taula.length - 1) {
			if (taula[x + 1][y - 1] == 1) {
				inferioresquerra = true;
			}
		}

		// Comprovamos errores
		if (inferioresquerra == true || inferiordreta == true) {
			error = true;
			return 0;
		} else if (dreta == true && inferior == true) {
			error = true;
			return 0;
		}
		// Miramos la siguiente posicion
		if (dreta == true) {
			taula[x][y] = 0;
			return 1 + comprovaPosicio(x, y + 1);
		} else if (inferior == true) {
			taula[x][y] = 0;
			return 1 + comprovaPosicio(x + 1, y);
		} else {
			taula[x][y] = 0;
			return 1;
		}

	}

}

import java.util.Scanner;

public class Cartas {
  public static void main(String[] args) {
		int num1, num2, mida;
		Scanner scan = new Scanner(System.in);
		String frase;
		int num;
		int interval;
		boolean fin = false; // Controla el fin del programa -> intervalo = 0
		 // hooolaaah
		//  011123334
		
		while(!fin) {
			num =0; 	// inicializamos el numero
			frase = scan.nextLine(); 	// leemos frase
			mida = frase.length(); 	// cogemos tamaño
			int array[] = new int[mida]; 	// creamos array para numeros 
			array[0] = 0; 	// Primera posicion siempre es 0
			for (int i = 1; i < mida; i++) {
				if(frase.charAt(i) != frase.charAt(i-1)) 	// Recorremos frase...
					num++;		// ...si la letra no coincide sumanos numero...
				array[i]=num; 	//... en ambos casos ponemos el numero en el array
			}			
			interval = Integer.parseInt(scan.next());	//asignamos intervalo
			if (interval == 0){		//comprobamos para fin
				fin=true;
			}
			for (int i = 0; i < interval; i++){				//asignamos num1 y num2
				num1 = Integer.parseInt(scan.next());		
				num2 = Integer.parseInt(scan.next());	
				if (array[num1] == array[num2]){	//coinciden los numeros en las posiciones num?
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
			}
			if (interval != 0){
				System.out.println();	//si no es fin imprimimos linea y arreglamos el scan
				scan.nextLine();
			}
		}
		scan.close();
	}
}

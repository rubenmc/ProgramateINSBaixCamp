import java.util.Scanner;

/**
 * Falta saber cuando acaba el bucle
 * No se ha testeado en el juez
 */

public class Cerillas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num ,max;
		boolean sortida = false;
		while(!sortida){
			//Leemos los numeros
			num = Integer.parseInt(scan.next());
			max = Integer.parseInt(scan.next());
			//Primer caso: el numero de cerillas es igual al numero maximo de retirada o al numero maximo +1
			if(num==max || num==max+1){
				System.out.println(num-1);
			} else if(num>max){ //Segundo caso, el numero de cerillas es mas grande que el numero maximo
				System.out.println(1);
			} else {//Tercer caso, el numero de cerillas es menos que el numero maximo
				if(num==1){//Si solo queda 1 perdemos
					System.out.println("PIERDO");
					sortida=true;
				} else {//Si quedan mas retiramos todas menos 1
					System.out.println(num-1);
				}
			}
		}
		

	}

}

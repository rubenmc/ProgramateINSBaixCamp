import java.util.Scanner;

/**
 * Calcula el ultimo numero del factorial del numero introducido
 * No se tiene que testear en el juez
 */

public class Factorial {


	public static void main(String[] args) {
		int num,repeticions,res;
		System.out.println("GO");
		Scanner scan = new Scanner(System.in);
		//Leemos numero de repeticiones
		repeticions=scan.nextInt();
		for(int i=0;i<repeticions;i++){
			//Leemos el numero introducido
			num=scan.nextInt();
			res=num;
			//Calculamos factorial
			for(int x=1;x<num;x++){
				res=res*x;
			}
			//Pasamos el factorial a string
			String out = new String(String.valueOf(res));
			//Imprimimos el ultimo caracter
			System.out.println(out.charAt(out.length()-1));
		}
		scan.close();

	}

}

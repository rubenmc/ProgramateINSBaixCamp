import java.util.Scanner;
/**
 * 
 * Indica en que parte de la etapa se tiene que colocar los suministros
 * 
 * Correcto en el juez
 *
 */

public class Ciclistas {

	static int contador_pos,pos_inici,longitud=0;
	
	public static void main(String[] args) {
		boolean pla = false;//Boolean para saber si ha encontrado alguna superficie plana
		int contador_metres=0,seguent,anterior;//Contadores y lectores
		Scanner scan = new Scanner(System.in);//Scaner para recoger los valores
		
		anterior = Integer.parseInt(scan.next());//Leemos el primer valor
		while(anterior!=-1){//Si el primer numero no es -1 procesaremos la etapa
			seguent = Integer.parseInt(scan.next());//Leemos el siguiente valor
			
			while(seguent!=-1){//Mientras no leamos -1 iremos leiendo todos los valores
				//Si el valor siguiente es igual al anterior indicamos que hemos encontrado una superficie plana y aumentamos el contador de metros
				if(seguent==anterior){
					pla = true;
					contador_metres++;
				//Si no, guardamos el nuevo valor, comprovamos si la anterior superficie plana es la mas larga y ponemos el contador de metros a 0
				} else {
					anterior = seguent;
					comprova_metres(contador_metres);
					contador_metres=0;
				}
				//Una vez procesado el nuevo numero, aumentamos el contador de posiciones y leemos el siguiente
				contador_pos++;
				seguent=Integer.parseInt(scan.next());
			}
			//Cuando acaba la etapa volvemos a ejecutar la comprovacion, por si el final de la etapa es la superficie plana mas larga
			comprova_metres(contador_metres);
			//Mostramos un mensaje dependiendo de si hemos encontrado una superficie plana o no
			if(pla){
				System.out.println(pos_inici+" "+longitud);
			} else {
				System.out.println("HOY NO COMEN");
			}
			//Reiniciamos variables
			pla = false;
			contador_metres=0;
			pos_inici=0;
			longitud = 0;
			contador_pos = 0;
			//Leemos primer numero de la nueva etapa
			anterior = Integer.parseInt(scan.next());
		}

	}
	//Metodo para comprovar si la nueva superficie plana es mas larga que la anterior
	private static void comprova_metres(int metres) {
		if(metres>longitud){
			pos_inici=contador_pos-metres;
			longitud=metres;
		}
		
	}

}

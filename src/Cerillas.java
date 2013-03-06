import java.util.Scanner;


public class Cerillas {

	/**
	 * Se ha añadido lectura en bucle infitio, falta testear en el juez
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num ,max;
		//Bucle infinito mientras nos metan datos
		while(casoDePrueba(scan)){
			//recumeramos valores
			num = Integer.parseInt(scan.next());
			max = Integer.parseInt(scan.next());
			//Si las cerillas que quedan son iguales al maximo o al maximo+1 recogemos el maximo -1
			if(num==max || num==max+1){
				System.out.println(num-1);
			//Si quedan mas de las que podemos coger recogemos 1
			} else if(num>max){
				System.out.println(1);
			//Si quedan menos de las que podemos coger comprovamos cuantas quedan
			} else {
				//Si solo queda 1 perdemos
				if(num==1){
					System.out.println("PIERDO");
				} else {
				//Si queda mas de una recogemos todas menos una
					System.out.println(num-1);
				}
			}
		}
	}
	//Metodo para comprovar si hay un valor que recoger
	public static boolean casoDePrueba(Scanner scan) {
		if (!scan.hasNext()){
			return false;
		} else {
			return true;
		}
	}
}


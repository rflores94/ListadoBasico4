import utiles.*;
/**
*Define la clase CerosYUnos que lea una secuencia de ceros y unos. Mostrará el número
*de ceros de la secuencia. Dejará de leer cuando el usuario introduzca el número 2.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class CerosYUnos{
	static int ceros=0;
	public static void main(String[] args) {
		while(true){
			comprobarNumero(Teclado.leerEntero("Dime un numeroq que sea 0 o 1. Introduce un 2 para salir."));
		}
	}

	static void comprobarNumero(int num){
		if(num==0)
			ceros++;
		else if(num==2){
			System.out.println("Se han introducido "+ceros+" ceros.");
			System.exit(0);
		}
	}
}
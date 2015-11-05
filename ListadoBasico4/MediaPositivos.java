import utiles.*;
/**
*Define la clase MediaPositivos que calcule la media de una serie de números positivos, introducidos por teclado.
*Dejará de leer cuando el usuario introduzca el 0. Utiliza métodos.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class MediaPositivos{
	public static void main(String[] args) {
		System.out.println("La media es: "+recogerPositivos());
	}

	static double recogerPositivos(){
		int i=0, positivo, media=0;
		do{
			do{
				positivo=Teclado.leerEntero("Dime un numero positivo: ");
			}while(positivo<0);
			media+=positivo;
			i++;
		}while(positivo!=0);
		return calcularMedia(i-1, media);
	}

	static double calcularMedia(int i, int media){
		return media/i;
	}
}
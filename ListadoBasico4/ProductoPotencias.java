import utiles.*;
/**
*Define la clase ProductoPotencias que calcule
*y visualice el producto de las potencias de 2 entre 0 y 10.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class ProductoPotencias{
	public static void main(String[] args) {
		double i=1, potencia;
		potencia=Math.pow(2, i);
		while(potencia<=10){
			System.out.print(potencia+"\t");
			i++;
			potencia=Math.pow(2, i);
		}
	}
}
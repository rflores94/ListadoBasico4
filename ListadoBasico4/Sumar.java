import utiles.*;
/**
*Define la clase Sumar que realice una suma y la muestre.
*Para ello implementa el método sumar que devuelva
*la suma de dos números, solicitados por teclado
*(sin argumentos) . Documéntalo correctamente (@return)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Sumar{
	public static void main(String[] args) {
		System.out.println("La suma es "+sumar());	
	}

	/**
	*Devuelve la suma de dos numeros
	*@return la suma
	*/
	static double sumar(){
		return Teclado.leerDecimal("Dime el primer sumando.") + Teclado.leerDecimal("Dime el segundo sumando.");
	}
}
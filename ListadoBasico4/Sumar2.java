import utiles.*;
/**
*Define la clase Sumar2 que realice una suma y la muestre.
*Para ello implementa el método sumar con los dos argumento
*que sean los sumandos. Ha de devolver su suma.
*Documéntalo correctamente (@param y @return)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Sumar2{
	public static void main(String[] args) {
		System.out.println("La suma es "+sumar(Teclado.leerDecimal("Dime el primer sumando."), Teclado.leerDecimal("Dime el segundo sumando.")));	
	}

	/**
	*Devuelve la suma de dos numeros
	*@return la suma
	*@param sumando1
	*@param sumando2
	*/
	static double sumar(int num1, int num2){
		return  num1 + num2;
	}
}
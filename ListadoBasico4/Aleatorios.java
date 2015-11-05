import utiles.*;
/**
*Define la clase Aleatorios que de forma repetitiva muestre un número aleatorio entre un mínimo y un máximo.
*Define el método generarAleatorio(min, max).
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Aleatorios{
	public static void main(String[] args) {
		do{
			generarAleatorio(Teclado.leerEntero("Dime el minimo"), Teclado.leerEntero("Dime el maximo"));
		}while(deseaContinuar());
	}

	static void generarAleatorio(int min, int max){
		System.out.println(Math.random()*(min-max)+max);
	}

	/**
	* Pregunta al usuario si desea continuar
	*@return la respuesta del usuario
	*/
	static boolean deseaContinuar(){
		char respuesta;
		respuesta=Teclado.leerCaracter("Desea continuar? (s/n)");
		if(respuesta=='s' || respuesta=='S')
			return true;
		else
			return false;
	}
}
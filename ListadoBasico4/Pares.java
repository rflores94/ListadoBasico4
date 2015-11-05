import utiles.*;
/**
*Define la clase Pares que de forma repetitiva indique si un número es par o impar. Define el método esPar(int)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Pares{
	public static void main(String[] args) {
		do{
			esPar(Teclado.leerEntero("Dime un numero y te digo si es par o impar."));
		}while(deseaContinuar());
	}

	/**
	* Muestra si un numero es par, impar o 0.
	*/
	static void esPar(int num){
		if(num==0)
			System.out.println("Es 0");
		else if(num%2==0)
			System.out.println("Es Par");
		else
			System.out.println("Es Impar");
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
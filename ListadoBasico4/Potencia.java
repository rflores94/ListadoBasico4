import utiles.*;
/**
*Define la clase Potencia que calcule y visualice la potencia de un número dada la base y el exponente.
*Se le preguntará al usuario si quiere repetir el programa. Utiliza métodos (deseaContinuar, mostrarInstrucciones…)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Potencia{
	public static void main(String[] args) {
		mostrarInstrucciones();
		do{
			System.out.println("La potencia es "
				+Math.pow(Teclado.leerEntero("Dime la base: "), Teclado.leerEntero("Dime el exponente:")));
		}while(deseaContinuar());
	}

	/**
	* Muestra las instrucciones
	*/
	static void mostrarInstrucciones(){
		System.out.println("Muestra la potencia de un numero, siendo introducidos por el usuario.");
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
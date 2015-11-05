import utiles.*;
/**
*Define la clase LeeCinco que lea cinco valores numéricos y calcule su producto. Se le preguntará al usuario si quiere repetir el
*programa. Utiliza métodos (deseaContinuar, leerCincoNumeros, System.out.println("El producto es: " + calcularResultado()…)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class LeeCinco{
	static int A, B, C ,D, E;
	public static void main(String[] args) {
		do{
			leerCincoNumeros();
			System.out.println("El producto es: "+calcularResultado());
		}while(deseaContinuar());
	}

	/**
	* Calcula el resultado de la multiplicacion
	*@return resultado
	*/
	static int calcularResultado(){
		return A*B*C*D*E;
	}

	/**
	* Lee y almacena 5 numeros
	*/
	static void leerCincoNumeros(){
		A=Teclado.leerEntero("Dime un numero: ");
		B=Teclado.leerEntero("Dime un numero: ");
		C=Teclado.leerEntero("Dime un numero: ");
		D=Teclado.leerEntero("Dime un numero: ");
		E=Teclado.leerEntero("Dime un numero: ");
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
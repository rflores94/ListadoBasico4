import utiles.*;
/**
*Define la clase Multiplica que realice de forma repetitiva multiplicaciones y las muestre,
*siempre y cuando el usuario responda afirmativamente a la pregunta: "¿Desea continuar? (s/n)".
*Para ello utiliza un método continuar (ejercicio anterior) e implementa también el método multiplicar
*con los dos argumentos que sean los factores. Ha de devolver su producto. Documéntalo correctamente (@param y @return)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Multiplica{
	public static void main(String[] args) {
		do{
			System.out.println("Dime dos numeros para multiplicarlos.");
			System.out.println("La multiplicacion es "
				+multiplicar(Teclado.leerEntero("Dime el primer numero: "), Teclado.leerEntero("Dime el segundo numero: ")));
		}while(deseaContinuar());
	}

	/**
	* Multiplica dos numeros
	*@param num1 primer numero
	*@param num2 segundo numero
	*@return la multiplicacion de los dos numeros
	*/
	static int multiplicar(int num1, int num2){
		return num1*num2;
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
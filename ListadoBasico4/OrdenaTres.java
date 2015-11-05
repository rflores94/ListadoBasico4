import utiles.*;
/**
*Define la clase OrdenaTres que ordene tres números enteros introducidos por teclado y los muestre por pantalla de forma*
decreciente. Se le preguntará al usuario si quiere repetir el programa. Utiliza métodos (deseaContinuar, leerTresEnteros,
*mostrarResultados…)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class OrdenaTres{
	public static void main(String[] args) {
		do{
			System.out.println(ordenar(Teclado.leerEntero("Dime un numero."), Teclado.leerEntero("Dime un numero."), Teclado.leerEntero("Dime un numero.")));
		}while(deseaContinuar());
	}

	/**
	* Ordena tres numeros introducidos por el usuario
	*@return Cadena con los numeros ordenados
	*/
	static String ordenar(int num1, int num2, int num3){
		if(num1<=num2 && num1<=num3 && num2<=num3)
			return num1+"<"+num2+"<"+num3;
		else if(num1<=num2 && num1<=num3 && num3<=num2)
			return num1+"<"+num3+"<"+num2;
		else if(num2<=num1 && num2<=num3 && num1<=num3)
			return num2+"<"+num1+"<"+num3;
		else if(num2<=num1 && num2<=num3 && num3<=num1)
			return num2+"<"+num3+"<"+num1;
		else if(num3<=num1 && num3<=num2 && num2<=num1)
			return num3+"<"+num2+"<"+num1;
		else
			return num3+"<"+num1+"<"+num2;
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
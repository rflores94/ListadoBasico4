import utiles.*;
/**
*Define la clase IvaConMetodos que calcule los impuestos que se aplican a un precio base en función de si el iva es
*superreducido (4%), reducido (10%) o general (21%). Para ello define y usa los siguientes métodos:
*a. pedirIVA()
*b. pedirPrecio()
*c. continuar()
*d. calcularIva(double, char)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class IvaConMetodos{
	public static void main(String[] args) {
		do{
			calcularIva(pedirPrecio(), pedirIVA());
		}while(deseaContinuar());
	}

	static void calcularIva(double precio, char iva){
		if(iva=='s' || iva =='S')
			System.out.println("El iva para el producto que cuesta "+precio+" es: "+precio*0.04);
		else if(iva=='r' || iva =='R')
			System.out.println("El iva para el producto que cuesta "+precio+" es: "+precio*0.1);
		else
			System.out.println("El iva para el producto que cuesta "+precio+" es: "+precio*0.21);
	}

	/**
	* Devuelve un char con el tipo de IVA
	*@return tipo de IVA
	*/
	static char pedirIVA(){
		char respuesta;
		do{
			respuesta=Teclado.leerCaracter("Dime el tipo de IVA(s,r,g): ");
		}while(comprobarIva(respuesta));
		return respuesta;
	}

	static boolean comprobarIva(char respuesta){
		if(respuesta=='s' || respuesta=='S' || respuesta=='r' || respuesta=='R' || respuesta=='g' || respuesta=='G')
			return false;
		return true;
	}

	/**
	* Pide al usuario el precio del producto
	*@return el precio en double
	*/
	static double pedirPrecio(){
		return Teclado.leerEntero("Dime el precio del producto.");
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
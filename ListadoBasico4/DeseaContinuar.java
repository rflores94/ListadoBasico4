import utiles.*;
/**
*Define la clase DeseaContinuar que realice la siguiente
*pregunta: "¿Desea continuar? (s/n)". En caso de que el
*usuario indique una "s" (minúscula o mayúscula) el
*programa seguirá preguntando. En otro caso,
*que se salga del programa. Para ello implementa el método
*continuar que devuelva true en caso de introducir una s,
*y false en caso contrario. Documéntalo correctamente
*(@return)
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class DeseaContinuar{
	public static void main(String[] args) {
		do{
			System.out.println("Hola");
		}while(deseaContinuar());
	}

	static boolean deseaContinuar(){
		char respuesta=Teclado.leerCaracter("Desea continuar? (s/n)");
		if(respuesta=='s' || respuesta=='S')
			return true;
		else
			return false;
	}
}
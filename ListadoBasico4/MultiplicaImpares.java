/**
*Define la clase MultiplicaImpares que multiplique los 20 primeros números impares y muestre el resultado en pantalla.
*
*@author Roberto Carlos Flores Gomez
*@verion 1.0
*/
public class MultiplicaImpares{
	public static void main(String[] args) {
		System.out.println("La multiplicacion de los 20 primeros impares es "+multiplicar());
	}

	static int multiplicar(){
		int i=0, impar=0, resultado=1;
		while(i<20){
			if (impar%2!=0) {
				resultado*=impar;
				impar++;
				i++;
			}
			impar++;
		}
		return resultado;
	}
}
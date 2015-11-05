import utiles.*;
/**
*Define la clase MultiplicaSoloImpares que multiplique 20 números impares leídos desde teclado y muestre el resultado en
*pantalla. Define al menos los métodos mostrarInstrucciones y leerImpar.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class MultiplicaSoloImpares{
	public static void main(String[] args) {
		int i=0;
		long resultado=1l;
		mostrarInstrucciones();

		while(i<20){
			resultado*=leerImpar();
			i++;
		}

		System.out.println("El resultado es "+resultado);
	}

	static int leerImpar(){
		int impar;
		do{
			impar=Teclado.leerEntero("Dime un Impar: ");
		}while(impar%2==0);
		return impar;
	}

	static void mostrarInstrucciones(){
		System.out.println("Dime 20 impares y los multiplico.");
	}
}
/**
*El siguiente código muestra el funcionamiento de las palabras reservadas break y
*continue. Similar a este código, crea la clase Multiplos17Hasta200 que utilice el bucle
*for, y Multiplos73Hasta1000 que utilice el bucle do-while.
*
*@author Roberto Carlos Flores Gomez
*@version 1.0
*/
public class Multiplos17Hasta200{
	public static void main(String[] args) {
		System.out.println("Multiplos de 17 hasta 200");

		for (int i=17; i<=200; i++) {
			if(i%17 != 0)
				continue;
			System.out.print("\t"+i);
		}
	}
}
import utiles.*;
/** 
* Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos. La nota será un número decimal 
comprendido entre 0 y 10, ambos inclusive. Utiliza métodos. Al finalizar el programa deberá mostrar:
a. Total de notas
b. Número de aprobados
c. Número de suspensos
d. Nota máxima
e. Nota mínima
f. Media

* @author: Roberto Carlos Flores Gomez
* @version: 1.0

*/

public class Alumnos{

		public static void main(String[] args){
		
			double nota=0, notamax=0, notamin=10, media=0;
			int numaprobados=0, contador=0, numsuspensos=0;
			
			System.out.println("\n\t\t\t\tNotas alumnos: \n");
			
			while (contador<30){
				nota=totalNotas(nota);
				System.out.print("\t"+nota+"\t");
				numaprobados+=contarAprobados(nota);
				numsuspensos+=contarSuspensos(nota);
				notamax=calcularMaxima(nota, notamax);
				notamin=calcularMinima(nota, notamin);
				media=calcularMedia(nota, media);
				contador++;
			}
			System.out.println("\nEl numero de aprobados es "+numaprobados);
			System.out.println("\nEl numero de suspensos es "+numsuspensos);
			System.out.println("\nLa nota maxima es "+notamax);
			System.out.println("\nLa nota minima es "+notamin);
			System.out.println("\nLa media de todas las notas es "+(media/30));
		}
		
		/**
		*
		* @return Devuelve el total de notas a la variable nota
		*
		* @param nota Double que va a devolver 
		*
		*/
		static double totalNotas(double nota){
			int aux;
			nota=Math.random()*10+1;
			return aux=(int)nota;
		}
		
		/**
		*
		* @return Devuelve el total de aprobados a la variable numaprobados
		*
		* @param nota Double que va a devolver
		*
		*/
		static int contarAprobados(double nota){
			int contador2=0;
			if (nota>4)
				contador2++;
			return contador2;
		}
		
		/**
		*
		* @return Devuelve el total de suspensos a la variable numsuspensos
		*
		* @param nota Double que va a devolver
		*
		*/
		static int contarSuspensos(double nota){
			int contador2=0;
			if (nota<5)
				contador2++;
			return contador2;
		}
		
		/**
		*
		* @return Devuelve la nota máxima a la variable notamax
		*
		* @param nota Double con el que opera y devuelve
		* @param notamax Double con el que opera y devuelve
		*
		*/
		static double calcularMaxima(double nota, double notamax){
			if (nota>notamax)
				return nota;
			else return notamax;
		}
		
		/**
		*
		* @return Devuelve la nota mínima a la variable notamin
		*
		* @param nota Double con el que opera y devuelve
		* @param notamax Double con el que opera y devuelve
		*
		*/
		static double calcularMinima(double nota, double notamin){
			if (notamin>nota)
				return nota;
			else return notamin;
		}
		
		/**
		*
		* @return Devuelve la nota media a la variable media
		*
		* @param nota Double con el que opera
		* @param media Double con el que opera y devuelve
		*
		*/
		static double calcularMedia(double nota, double media){
			return nota+media;
		}

}
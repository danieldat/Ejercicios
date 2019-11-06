package test1;

import java.util.Scanner;


public class Ejerciciodivisble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner di=new Scanner(System.in) ;
		
		
		System.out.print("Escriba el número que quiera saber si es divisible");
		
		int lo=di.nextInt();

		
		if (lo%2==0 && lo%3==0) {System.out.println("El número es multiplo de 2 y de 3");}
		else {System.out.println("EL número no es multiplo de ninguno");}
		
		if (lo%2==0 ||lo%3==0) {System.out.println("El número es multiplo de uno de los dos");}
		else {System.out.println("EL número no es multiplo de ninguno");}
		
		if (lo%2==0 ^ lo%3==0) {System.out.println("El número solo es multiplo de uno de ellos de 2 y de 3");}
		else {System.out.println("EL número no es multiplo de ninguno");}
		
		
		
	}

}

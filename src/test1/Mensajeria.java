package test1;

import java.util.Scanner;

public class Mensajeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner mens=new Scanner(System.in);
		
		
		System.out.println("Introduzca peso");
		
	double peso=mens.nextDouble();
	
	if (peso > 0 && peso<=2) {
		System.out.println("Total a pagar "+(2.5*peso)+"€");}
	
	
	if (peso > 2 && peso<=4) {
		System.out.println("Total a pagar "+(4.5*peso)+"€");}
		
		if (peso > 4 && peso<=7) {
			System.out.println("Total a pagar "+(7.5*peso)+"€");}
	
	
			if (peso >7 && peso<=10) {
				System.out.println("Total a pagar "+(10.5*peso)+"€");}
				
				if (peso >10) {
					System.out.println("Pesa mucho pasamos");}
				
			}
}
		
			
		
		
	
	



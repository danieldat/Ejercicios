package test1;

import java.util.Scanner;


public class bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner r=new Scanner(System.in) ;
	
	int bi;
	
	System.out.print("Introduzca el año y te dire si es bisiesto o no");
	
	bi=r.nextInt();
	
	
	if(bi%4==0 && bi%100!=0 || bi%400==0) {System.out.print("Si es bisiesto!!!!Ese año tiene 366 dias");}
	else {System.out.print("No,no es bisiesto,oooh");}
	
	
	
	
	}

}

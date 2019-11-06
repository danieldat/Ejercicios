package test1;

import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lt=new Scanner(System.in);
		
	System.out.println("Introduzca el numero de su cupón");
	
		
		int p=lt.nextInt();      int s=lt.nextInt();
		
		
		int lo=(int) (Math.random()*9);
		int la=(int) (Math.random()*9);
		
		
		if (p==lo && s==la)  {System.out.print("Tan tocao 1000 pavetes!!");}
	
		if (p==la && s==lo)  {System.out.print("Tan tocao 3000 pavetes!!");}
	
		if (p==lo || s==la)  {System.out.print("Tan tocao 1000 pavetes!!");}
	
		
		System.out.println("EL número agraciado es el "+lo+la);
		}
	
	}


package test1;

import java.util.Scanner;

public class mientras{
public static void main (String [] args){
	
	
	
	Scanner input= new Scanner(System.in);
	
	
	char continueLoop='Y';
	while (continueLoop=='Y') {
		System.out.print("Introduce Y para continuar y N pasa salir: ");
		continueLoop=input.next().charAt(0);
	}
	
	
	
}
}
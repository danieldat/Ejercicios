package test1;

import java.util.Scanner;



public class Impuestos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imp=new Scanner(System.in);
	
		int op;
	System.out.println("Introduzca su rango salarial");
	double ga=imp.nextDouble();
	
	System.out.println("Para saber cuanto pagará en impuestos introduzca el número en función de  su estado civil");
	System.out.println("1.Soltero");
	System.out.println("2.Recien casado o viudo");
	System.out.println("3.Casado o separado");
	System.out.println("4.Cabeza de familia");
	
	op=imp.nextInt();
	
	switch (op) {
	
	case (1):if(ga<8350) {System.out.println("Te corresponde un 10%,con lo que pagaras un total de "+ga*0.1+"€");}
	         if(ga>8351 && ga<33950) {System.out.println("Te corresponde un 15%,con lo que pagaras un total de "+ga*0.15+"€");}
	         if(ga>33950 && ga<171550) {System.out.println("Te corresponde un 25%,con lo que pagaras un total de "+ga*0.25+"€");}
	         if(ga>171551 && ga<372900) {System.out.println("Te corresponde un 33%,con lo que pagaras un total de "+ga*0.33+"€");}
	         if(ga>372900) {System.out.println("Te corresponde un 35%,con lo que pagaras un total de "+ga*0.35+"€");}
		break;

	case (2):if(ga<16700) {System.out.println("Te corresponde un 10%,con lo que pagaras un total de "+ga*0.1+"€");}
    		if(ga>16700 && ga<67900) {System.out.println("Te corresponde un 15%,con lo que pagaras un total de "+ga*0.15+"€");}
    		if(ga>67901 && ga<137900) {System.out.println("Te corresponde un 25%,con lo que pagaras un total de "+ga*0.25+"€");}
    		if(ga>137901 && ga<28850) {System.out.println("Te corresponde un 33%,con lo que pagaras un total de "+ga*0.33+"€");}
    		if(ga>28851) {System.out.println("Te corresponde un 35%,con lo que pagaras un total de "+ga*0.35+"€");}
    		break;
	
	case (3):if(ga<8350) {System.out.println("Te corresponde un 10%,con lo que pagaras un total de "+ga*0.1+"€");}
    if(ga>8351 && ga<33950) {System.out.println("Te corresponde un 15%,con lo que pagaras un total de "+ga*0.15+"€");}
    if(ga>33950 && ga<68001) {System.out.println("Te corresponde un 25%,con lo que pagaras un total de "+ga*0.25+"€");}
    if(ga>68010 && ga<372900) {System.out.println("Te corresponde un 33%,con lo que pagaras un total de "+ga*0.33+"€");}
    if(ga>372900) {System.out.println("Te corresponde un 35%,con lo que pagaras un total de "+ga*0.35+"€");}
    break;
    
	case (4):if(ga<12000) {System.out.println("Te corresponde un 10%,con lo que pagaras un total de "+ga*0.1+"€");}
    		 if(ga>12001 && ga<45000) {System.out.println("Te corresponde un 15%,con lo que pagaras un total de "+ga*0.15+"€");}
    		 if(ga>45001 && ga<117000) {System.out.println("Te corresponde un 25%,con lo que pagaras un total de "+ga*0.25+"€");}
    		 if(ga>117001 && ga<190000) {System.out.println("Te corresponde un 33%,con lo que pagaras un total de "+ga*0.33+"€");}
    		 if(ga>190001) {System.out.println("Te corresponde un 35%,con lo que pagaras un total de "+ga*0.35+"€");}
    		 break;
    
	}
	
	}

}

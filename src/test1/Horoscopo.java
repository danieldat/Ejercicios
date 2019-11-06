package test1;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ho=new Scanner(System.in);
		
		System.out.println("Introduzca su año de nacimiento y te dire el horoscopo chino");
		int an=ho.nextInt();
		
		int sol=an%12;
		
		switch (sol) {
		
		case (0):{System.out.println(an+" Su año es el monito");break;}
		
		case (1):{System.out.println(an+" Su año es el gallo");break;}
		
		case (2):{System.out.println(an+" Su año es el perrito");break;}
		
		case (3):{System.out.println(an+" Su año es el cerdito");break;}
		
		case (4):{System.out.println(an+" Su año es el ratita");break;}
		
		case (5):{System.out.println(an+" Su año es el buey");break;}
		
		case (6):{System.out.println(an+" Su año es el tigre");break;}
		
		case (7):{System.out.println(an+" Su año es el conejito");break;}
		
		case (8):{System.out.println(an+" Su año es el dragon");break;}
		
		case (9):{System.out.println(an+" Su año es el serpìente");break;}
		
		case (10):{System.out.println(an+" Su año es el caballito");break;}
		
		case (11):{System.out.println(an+" Su año es el ovejilla");break;}

		}
		}
	}
	



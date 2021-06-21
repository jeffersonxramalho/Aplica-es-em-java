package quadrado;

import java.util.Scanner;

public class Nquadrado {

	public static void main(String[] args) {
		
	 Scanner LerNumeros = new Scanner(System.in);
	 
	 int a;
	 int b;
	 int c;
	 int d;
	 
	 System.out.println("Informe o primeiro numero: ");
	 a = LerNumeros.nextInt();
	 System.out.println("Informe o segundo numero: ");
	 b = LerNumeros.nextInt();
	 System.out.println("Informe o terceiro numero: ");
	 c = LerNumeros.nextInt();
	 System.out.println("Informe o quarto numero: ");
	 d = LerNumeros.nextInt();
	 
	 
	 	if(c*c >= 1000) {
	 		
	 		System.out.println("O quadrado de c é: " +c*c);
	 	}
	 	else {
	 		
	 		 System.out.println("a = "+a);
		     System.out.println("b = "+b);
		     System.out.println("c = "+c);
		     System.out.println("d = "+d);
		     System.out.println("a2 = "+ (a*a) );
		     System.out.println("b2 = "+ (b*b) );
		     System.out.println("c2 = "+ (c*c) );
		     System.out.println("d2 = "+ (d*d) );
	 	}
	 		
	}

}

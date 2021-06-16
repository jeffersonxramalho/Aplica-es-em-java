package somadoisnumeros;

import java.util.Scanner;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		
		int n1;
		int n2;
		
		System.out.println("informe o primeiro numero: ");
		n1 = ler.nextInt();
		
		System.out.println("informe o segundo numero: ");
        n2 = ler.nextInt();
        
		
		int soma = n1 + n2;
		
		System.out.println("A soma dos dois números é:"+soma);

	}

}

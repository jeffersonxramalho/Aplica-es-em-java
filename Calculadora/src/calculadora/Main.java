package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
int n1;
int n2;

     Scanner input = new Scanner(System.in);

     System.out.println("informe o primeiro numero: ");
     n1 = input.nextInt();
     
     System.out.println("informe o segundo numero: ");
     n2 = input.nextInt();
     
     System.out.println("A soma do primeiro mais o segundo é: "+(n1+n2));
     
     System.out.println("A subtração do primeiro mais o segundo é: "+(n1-n2));
     
     System.out.println("A multiplicação do primeiro mais o segundo é: "+(n1*n2));
     
     System.out.println("A divisão do primeiro mais o segundo é: "+(n1/n2));
     
	}

}

package parouimpar;
import java.util.Scanner;
public class Parouimpar {

	public static void main(String[] args) {
		
		Scanner Numeros = new Scanner(System.in);
		
		System.out.println("INFORME UM NUMERO: ");
        int n1 = Numeros.nextInt();

        if (n1 % 2 == 0 && n1 >= 0) {
            System.out.println("PAR E POSITIVO");
        } else if (n1 % 2 != 0 && n1 >= 0) {
            System.out.println("ÍMPAR E POSITIVO");

        } else if (n1 % 2 ==0 && n1 < 0) {
            System.out.println("PAR E NEGATIVO");

        } else if (n1 % 2 != 0 && n1 < 0) {
            System.out.println("ÍMPAR E NEGATIVO");
        }

	}

}

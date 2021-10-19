package exerc_if_else;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {

				Scanner teclado = new Scanner(System.in);
				System.out.println("Vamos descobri qual a classificação do Triagulo.");
				System.out.println("");
				System.out.println("Qual o valor...");
				System.out.println("Primeiro lado:");
				float side1 = teclado.nextFloat();

				System.out.println("Segundo lado:");
				float side2 = teclado.nextFloat();

				System.out.println("Terceiro lado:");
				float side3 = teclado.nextFloat();

				if (side1 == side2 && side2 == side3) {
					System.out.printf("O triângulo é Equilátero. \n");
				}

				else if (side1 == side2 && side2 != side3 || side1 != side2 && side2 == side3
						|| side1 == side3 && side1 != side2) {
					System.out.printf("O triângulo é Isósceles. \n");
				}

				else {
					System.out.printf("O triângulo é escaleno. \n");
				}
				
				System.out.println("");
				System.out.println("");
				System.out.println("Agora vamos descobrir se o ano é bisexto.");
				System.out.println("Vamos la...");
				System.out.println("");
				System.out.println("Digite o ano:");
				float ano = teclado.nextFloat();
				
				if (ano % 400 == 0) {
					System.out.printf("%.0f é Bissexto.", ano);
				}
				
				else if (ano % 4 == 0 && ano % 100 !=0) {
					System.out.printf("%.0f é Bissexto.", ano);	
				}
				
				else {
					System.out.printf("%.0f não é Bissexto.", ano);
				}
			}
}
package avaliacao;

import java.util.Random;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int entrada;
		int random = rand.nextInt(3);
		String tipo1,tipo2;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println ("Jokenpo");
		System.out.println ("1.Pedra");
		System.out.println ("2.Papel");
		System.out.println ("3.Tesoura");
		System.out.print("Digite a op��o:");
		entrada = teclado.nextInt();
		
		if (entrada == 1 && random == 3) {
			tipo1 = "Pedra"; tipo2 = "Tesoura";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Voc� Venceu");
		} else if (entrada == 1 && random == 2) {
			tipo1 = "Pedra"; tipo2 = "Papel";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Voc� Perdeu");
		}else if (entrada == 1 && random == 1) {
			tipo1 = "Pedra"; tipo2 = "Pedra";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Empate, jogue novamente!");
			
		}else if (entrada == 2 && random == 1) {
			tipo1 = "Papel"; tipo2 = "Pedra";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Voc� venceu");
		}else if (entrada == 2 && random == 3) {
			tipo1 = "Papel"; tipo2 = "Tesoura";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Voc� Perdeu");
		}else if (entrada == 2 && random == 2) {
			tipo1 = "Papel"; tipo2 = "Papel";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Empate, jogue novamente!");
			
		}else if (entrada == 3 && random == 1) {
			tipo1 = "Tesoura"; tipo2 = "Pedra";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Voc� Perdeu");
			
		}else if (entrada == 3 && random == 2) {
			tipo1 = "Tesoura"; tipo2 = "Papel";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Voc� venceu");
			
		}else if (entrada == 3 && random == 3) {
			tipo1 = "Tesoura"; tipo2 = "Tesoura";
			System.out.println("Voc�="+tipo1);
			System.out.println("Computador="+tipo2);
			System.out.println("Empate, jogue novamente!");
		}
	}
}
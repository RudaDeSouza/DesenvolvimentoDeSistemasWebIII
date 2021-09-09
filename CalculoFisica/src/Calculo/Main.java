package Calculo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	Contas contas = new Contas();
	int escolha;
	
do {
	System.out.println("===============Calculadora=de=F�sica============");
	System.out.println("Escolha uma das op��es:");
	System.out.println("0 - Sair");
	System.out.println("1 - For�a peso");
	System.out.println("2 - For�a centr�peta");
	System.out.println("3 - Impulso");
	System.out.println("4 - For�a el�stica");
	System.out.println("5 - Velocidade m�dia");
	System.out.println("6 - Movimento retil�neo uniforme (MRU)");
	System.out.println("7 - Movimento retil�neo uniforme variado (MRUV)");
	System.out.println("===============================================");
	escolha = tec.nextInt();
	switch(escolha) 
	{
	case 1:
		System.out.println(contas.calcularForcaPeso());
		break;
	case 2:
		System.out.println(contas.calcularForcaCentripeta());
		break;
	case 3:
		System.out.println(contas.calcularImpulso());
		break;
	case 4:
		System.out.println(contas.calcularForcaElastica());
		break;
	case 5:
		System.out.println(contas.calcularVelocidadeMedia());
		break;
	case 6:
		System.out.println(contas.calcularMRU());
		break;
	case 7:
		System.out.println(contas.calcularMRUV());
		break;
	default:
		System.err.println("Essa op��o � inv�lida! escolha outra.");
	} 
} while (escolha != 0);
	}
}

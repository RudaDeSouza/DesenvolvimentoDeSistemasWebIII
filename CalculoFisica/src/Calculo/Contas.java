package Calculo;

import java.util.Scanner;

public class Contas {
	
Scanner tec = new Scanner(System.in);

public double calcularForcaPeso()
{
	double massa, gravidade, resultado;
	System.out.println("Digite a massa do objeto/corpo:");
	massa = tec.nextDouble();
	System.out.println("Digite a acelera��o da gravidade:");
	gravidade = tec.nextDouble();
	System.out.println("O resultado �: "); return resultado = massa * gravidade;
	}

public double calcularForcaCentripeta() 
{
	double massa, velocidade, raio, resultado;
	System.out.println("Digite a massa do objeto/corpo:");
	massa = tec.nextDouble();
	System.out.println("Digite a velocidade do objeto/corpo:");
	velocidade = tec.nextDouble();
	System.out.println("Digite o raio da curva:");
	raio = tec.nextDouble();
	System.out.println("O resultado �:"); return resultado = massa * ((velocidade*velocidade) / raio);
}

public double calcularImpulso() 
{
	double forca, intervaloTempo, tempoInicial, tempoFinal, resultado;
	System.out.println("Digite a for�a exercida sobre o objeto/corpo:");
	forca = tec.nextDouble();
	System.out.println("Digite o tempo inicial da intera��o:");
	tempoInicial = tec.nextDouble();
	System.out.println("Digite o tempo final da intera��o:");
	tempoFinal = tec.nextDouble();
	intervaloTempo = tempoFinal - tempoInicial;
	System.out.println("O resultado �: "); return resultado = forca * intervaloTempo;
}

public double calcularForcaElastica()
{
	double forca,constanteElastica, deformacao;
	System.out.println("Digite a constante el�stica do corpo:");
	constanteElastica = tec.nextDouble();
	System.out.println("Digite a deforma��o do objeto:");
	deformacao = tec.nextDouble();
	System.out.println("A for�a aplicada sobre o objeto �: "); return forca = deformacao * constanteElastica;
}

public double calcularVelocidadeMedia() 
{
	double tempoInicial, tempoFinal, posicaoInicial, posicaoFinal, intervaloTempo, intervaloPosicao, velocidadeMedia;
	System.out.println("Digite o tempo inicial:");
	tempoInicial = tec.nextDouble();
	System.out.println("Digite o tempo final:");
	tempoFinal = tec.nextDouble();
	System.out.println("Digite a posi��o inicial:");
	posicaoInicial = tec.nextDouble();
	System.out.println("Digite a posi��o final:");
	posicaoFinal = tec.nextDouble();
	intervaloTempo = tempoFinal - tempoInicial;
	intervaloPosicao = posicaoFinal - posicaoInicial;
	System.out.println("A velocidade m�dia �: "); return velocidadeMedia = intervaloPosicao / intervaloTempo;
}

public double calcularMRU() {
	double tempoInicial, tempoFinal, posicaoInicial, posicaoFinal, intervaloTempo, intervaloPosicao, velocidadeMedia;
	System.out.println("Digite o tempo inicial:");
	tempoInicial = tec.nextDouble();
	System.out.println("Digite o tempo final:");
	tempoFinal = tec.nextDouble();
	System.out.println("Digite a posi��o inicial do percurso:");
	posicaoInicial = tec.nextDouble();
	System.out.println("Digite a posi��o final do percurso:");
	posicaoFinal = tec.nextDouble();
	intervaloTempo = tempoFinal - tempoInicial;
	intervaloPosicao = posicaoFinal - posicaoInicial;
	System.out.println("A velocidade m�dia �: "); return velocidadeMedia = intervaloPosicao / intervaloTempo;
}

public double calcularMRUV() {
	double tempoInicial, tempoFinal, velocidadeInicial, velocidadeFinal, intervaloTempo, intervaloVelocidade, aceleracaoMedia;
	System.out.println("Digite o tempo inicial:");
	tempoInicial = tec.nextDouble();
	System.out.println("Digite o tempo final:");
	tempoFinal = tec.nextDouble();
	System.out.println("Digite a velocidade inicial:");
	velocidadeInicial = tec.nextDouble();
	System.out.println("Digite a velocidade final:");
	velocidadeFinal = tec.nextDouble();
	intervaloTempo = tempoFinal - tempoInicial;
	intervaloVelocidade = velocidadeFinal - velocidadeInicial;
	System.out.println("A Acelera��o m�dia �: "); return aceleracaoMedia = intervaloVelocidade / intervaloTempo;
}
}

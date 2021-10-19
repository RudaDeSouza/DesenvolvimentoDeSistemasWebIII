package sistema_banco;

public class Conta {
	private int numero;
	private float saldo;
	
	public Conta(int numero, float saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	public Conta(int numero) {
		super();
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return String.format("N�mero de conta: %d\nSaldo dispon�vel: %.2f\n", this.numero, this.saldo);
	}
	
}
package banco.model;

public abstract class Conta {

	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1000;


	public Conta(Cliente cliente) {	
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL;
		this.cliente = cliente;
		SEQUENCIAL++;		
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double sacar(double valor) {
		if(valor < this.saldo) {
			this.saldo -= valor;
			return valor;
		}
		return 0.0;
	}
	
	public void depositar(double valor) {
		if(valor > 0)
			this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		contaDestino.depositar(this.sacar(valor));
	}
	
	public StringBuilder retornaInformacoesConta() {
		StringBuilder builder = new StringBuilder();
		builder.append("CLIENTE: "+this.cliente.getNome().toUpperCase()+"\n");
		builder.append("AGENCIA: "+this.getAgencia()+" | NÚMERO: "+this.getNumero()+"\n");
		builder.append("Saldo: "+this.getSaldo());
		return builder;
	}
}

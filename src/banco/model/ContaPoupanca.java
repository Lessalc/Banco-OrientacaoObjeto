package banco.model;

public class ContaPoupanca extends Conta  {
	
	private double rendimentoMes;
	
	public ContaPoupanca(Cliente cliente, double rendimentoMes) {
		super(cliente);
		this.rendimentoMes = rendimentoMes;
	}
	
	public void rendimento() {
		this.depositar(rendimentoMes*this.getSaldo());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("=== EXTRATO CONTA POUPANÇA ===\n");
		builder.append(this.retornaInformacoesConta());
		
		return builder.toString();
	}

	
}

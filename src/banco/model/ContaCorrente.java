package banco.model;

public class ContaCorrente extends Conta {
	

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("=== EXTRATO CONTA CORRENTE ===\n");
		builder.append(this.retornaInformacoesConta());
		
		return builder.toString();
	}

	
}

package banco.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void adicionaConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public List<String> retornaClientes(){
		return this.contas.stream().map(conta -> conta.getCliente().getNome()).collect(Collectors.toList());
	}
	
	public Conta retornaConta(int index) {
		return this.contas.get(index);
	}

	public void depositar(int conta, double valor) {
		this.contas.get(conta).depositar(valor);
	}

	public void sacar(int conta, double valor) {
		this.contas.get(conta).sacar(valor);
	}

	public void transferir(int origem, int destino, double valor) {
		this.contas.get(origem).transferir(valor, this.contas.get(destino));
		
	}

	
}

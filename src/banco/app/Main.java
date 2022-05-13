package banco.app;

import java.util.ArrayList;
import java.util.List;

import banco.model.Banco;
import banco.model.Cliente;
import banco.model.Conta;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;

public class Main {

	
	public static void main(String[] args) {	
		
		Cliente cliente = new Cliente("Luciano");
		Cliente cliente2 = new Cliente("Maria");
		
		Banco banco = new Banco("Banco X");
		
		banco.adicionaConta(new ContaCorrente(cliente));
		
		banco.depositar(0, 500.00);
		banco.sacar(0, 200.00);
		banco.sacar(0, 500.00);
		
		System.out.println(banco.retornaConta(0));
		
		ContaPoupanca cp = new ContaPoupanca(cliente2, 0.003);
		banco.adicionaConta(cp);
		
		banco.transferir(0,1,100.0);
		
		System.out.println(banco.retornaConta(0));
		System.out.println(banco.retornaConta(1));
		
		cp.rendimento();
		
		System.out.println(banco.retornaConta(0));
		System.out.println(banco.retornaConta(1));
	}
	
	
}

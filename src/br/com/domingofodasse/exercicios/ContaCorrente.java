package br.com.domingofodasse.exercicios;

import java.util.Scanner;
 
public class ContaCorrente {

	// colentando informações do usuario
	
	Scanner leitor = new Scanner(System.in);
	
	//atributo
	int agencia,conta = leitor.nextInt();
	float saldo = leitor.nextFloat();
	boolean saque;
	

	
	//metodo
	void meuSaldo(float saldoAtual) {
		
		saldo = saldoAtual;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Digite sua agencia:");
		
		System.out.println("Digite sua conta:");
		
		
	}
	
}

package br.com.domingofodasse.exercicios;

// importando o atributo de leitura de dados do JRE
import java.util.Scanner;


public class Leitura {
	
	public static void main(String[] args) {
	

		// criando o metodo "leitor" para coletar a entrada de dados via teclado
		Scanner leitor = new Scanner(System.in);
		
		//realizando o input dos dados do nome
		System.out.println("Digite seu nome:");
		String nome = leitor.next();
		
		
		//exibindo os dados na tela referente ao valor Nome
		System.out.println("Seu nome é:" + nome);

		//realizando o input dos dados da idade
		System.out.println("Digite o ano de nascimento:");
		int nasc = leitor.nextInt();
				
					
		//exibindo os dados na tela referente ao valor idade
		System.out.println("Sua idade é:" + (2022-nasc));

		
	}

	
}

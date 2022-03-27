package br.com.domingofodasse.exercicios;

public class Pessoa {
	
	
	//atributos
	String nome;
	
	int idade;
	
	//metodos
	String meuNome(String nomeComp){
		
		nome = nomeComp;
		
		return nome;

	}
	

	int minhaIdade(int idadeAtual) {
		
		idade = idadeAtual;
		
		return idade;
	}


}

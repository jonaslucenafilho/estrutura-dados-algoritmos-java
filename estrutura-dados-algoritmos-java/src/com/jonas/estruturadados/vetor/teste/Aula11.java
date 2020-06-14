package com.jonas.estruturadados.vetor.teste;

import com.jonas.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(2);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-5678", "contato2@email.com");
		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		
		System.out.println(vetor);
	}
}

package com.jonas.estruturadados.vetor.teste;

import com.jonas.estruturadados.vetor.Vetor;

public class Aula04 {
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		System.out.println(vetor.getTamanho());
		
		System.out.println(vetor);
	}
}

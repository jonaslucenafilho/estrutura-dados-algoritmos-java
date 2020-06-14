package com.jonas.estruturadados.vetor.teste;

import com.jonas.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("E");
		vetor.adicionar("F");
		vetor.adicionar("G");
		
		System.out.println(vetor);
		
		vetor.remover(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento E");
		
		int pos = vetor.buscar("E");
		if (pos > -1) {
			vetor.remover(pos);
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}
}

package com.jonas.estruturadados.pilha.teste;

import com.jonas.estruturadados.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for ( int i = 1; i <= 10; i++) {
			pilha.empilhar(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.getTamanho());
	}
}

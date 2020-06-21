package com.jonas.estruturadados.pilha.teste;

import com.jonas.estruturadados.pilha.Pilha;

public class Aula15 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		
		pilha.empilhar(1);

		System.out.println(pilha.estaVazia());
	}
}

package com.jonas.estruturadados.pilha.teste;

import com.jonas.estruturadados.pilha.Pilha;

public class Aula17 {

	public static void main(String[] args) {
	
		Pilha<Integer> pilha = new Pilha<Integer>();
			
		System.out.println(pilha);
		
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		
		System.out.println(pilha);
		
		System.out.println("Desempilhando elemento " + pilha.desempilhar());
		
		System.out.println(pilha);
	}
}

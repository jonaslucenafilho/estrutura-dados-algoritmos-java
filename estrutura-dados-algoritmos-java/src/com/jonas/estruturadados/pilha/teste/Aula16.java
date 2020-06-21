package com.jonas.estruturadados.pilha.teste;

import com.jonas.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.topo());
		
		System.out.println(pilha);
		
		pilha.empilhar(1);
		pilha.empilhar(2);
		
		System.out.println(pilha.topo());
		
		System.out.println(pilha);
	}
}

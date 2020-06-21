package com.jonas.estruturadados.vetor.labs;

import com.jonas.estruturadados.vetor.Lista;

public class Exer03 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");
		
		System.out.println(lista);
		
		lista.remover("A");
		
		System.out.println(lista);
		
		lista.remover("E");
		
		System.out.println(lista);
		
		lista.remover("C");
		
		System.out.println(lista);
	}
}

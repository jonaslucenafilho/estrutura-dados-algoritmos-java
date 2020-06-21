package com.jonas.estruturadados.vetor.labs;

import com.jonas.estruturadados.vetor.Lista;

public class Exer01 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<>(5);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));
	}
}

package com.jonas.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.jonas.estruturadados.vetor.Lista;

public class Exer02 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");
		
		System.out.println(arrayList.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<String>(5);
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("A");
		
		System.out.println(lista.ultimoIndice("A"));

	}
}

package com.jonas.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.jonas.estruturadados.vetor.Lista;

public class Exer05 {

	public static void main(String[] args) {
	
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
		
		Lista<String> lista = new Lista<String>(5);
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		lista.adicionar("E");
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
	}
}

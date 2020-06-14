package com.jonas.estruturadados.vetor.teste;

import com.jonas.estruturadados.vetor.VetorDeObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorDeObjetos vetor = new VetorDeObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@email.com");
		Contato c2 = new Contato("Contato 2", "2345-5678", "contato2@email.com");
		Contato c3 = new Contato("Contato 3", "6789-5678", "contato3@email.com");
		
		Contato c4 = new Contato("Contato 3", "6789-5678", "contato3@email.com");

		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		vetor.adicionar(c3);
		
		System.out.println("Tamanho= " + vetor.getTamanho());
		
		int pos = vetor.buscar(c4);
		if (pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
	}
}

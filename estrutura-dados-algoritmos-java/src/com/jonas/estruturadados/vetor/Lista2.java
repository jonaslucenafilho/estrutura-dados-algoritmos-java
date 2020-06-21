package com.jonas.estruturadados.vetor;

import com.jonas.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

	public Lista2() {
		super();
	}
	
	public Lista2(int capacidade) {
		super(capacidade);
	}
	
	public boolean adicionar(T elemento) {
		return super.adicionar(elemento);
	}
	
	public boolean adicionar(int posicao, T elemento) {
		return super.adicionar(posicao, elemento);
	}
}

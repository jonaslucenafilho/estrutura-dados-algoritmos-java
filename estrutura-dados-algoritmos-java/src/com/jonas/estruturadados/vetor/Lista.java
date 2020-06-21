package com.jonas.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista() {
		this(10);
	}
	
	public boolean adicionar(T elemento) {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	public void adicionar(T elemento, int posicao) {
		this.aumentarCapacidade();
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}
	
	private void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public T obtem(int posicao) {
		return this.buscar(posicao);
	}
	
	public T buscar(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int buscar(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public int ultimoIndice(T elemento) {
		for(int i = this.tamanho - 1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean contem(T elemento) {
		return buscar(elemento) > -1;
	}
	
	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}
	
	public void remover(T elemento) {
		int pos = this.buscar(elemento);
		if (pos > -1) {
			this.remover(pos);
		}
	}
	
	public void limpar() {
		//opção 1
		//this.elementos = (T[]) new Object[this.elementos.length];
		
		//opção 2
		this.tamanho = 0;
		
		//opção 3
		for (int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for (int i = 0; i < this.tamanho - 1; i++) {
			sb.append(this.elementos[i]);
			sb.append(", ");
		}
		
		if (this.tamanho > 0) {
			sb.append(this.elementos[this.tamanho - 1]);
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}

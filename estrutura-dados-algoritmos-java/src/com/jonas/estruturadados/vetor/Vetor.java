package com.jonas.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adicionar(String elemento) { for (int i = 0; i <
	 * this.elementos.length; i++) { if (this.elementos[i] == null) {
	 * this.elementos[i] = elemento; break; } } }
	 */

	/*
	 * public void adicionar(String elemento) throws Exception { if(this.tamanho <
	 * this.elementos.length) { this.elementos[this.tamanho] = elemento;
	 * this.tamanho++; } else { throw new
	 * Exception("Vetor já está cheio, não é possível adicionar mais elementos!"); }
	 * }
	 */

	public boolean adicionar(String elemento) {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	public void adicionar(String elemento, int posicao) {
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
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public String buscar(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int buscar(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
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

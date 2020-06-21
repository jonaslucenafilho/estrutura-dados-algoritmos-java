package com.jonas.estruturadados.pilha.teste;

import java.util.Stack;

import com.jonas.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		System.out.println(pilha.estaVazia());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.empilhar(3);
		
		System.out.println(stack.isEmpty());
		System.out.println(pilha.estaVazia());
		System.out.println(stack.size());
		System.out.println(pilha.getTamanho());
		System.out.println(stack);
		System.out.println(pilha);
		
		System.out.println(stack.peek());
		System.out.println(pilha.topo());
		
		System.out.println(stack.pop());
		System.out.println(pilha.desempilhar());
		
		System.out.println(stack);
		System.out.println(pilha);
	}
}

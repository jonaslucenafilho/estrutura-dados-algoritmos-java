package com.jonas.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.jonas.estruturadados.vetor.teste.Contato;

public class Exer07 extends Exer06 {

	public static void main(String[] args) {
		
		//cria��o das vari�veis
		Scanner scan = new Scanner(System.in);
		
		//criar vetor com 20 de capacidade
		ArrayList<Contato> arrayList = new ArrayList<Contato>(20);
		
		//criar e adicionar 30 contatos
		criarContatosDinamicamente(5, arrayList);
		
		//criar um menu para que o usu�rio escolha a op��o
		int opcao = 1; 
				
		while (opcao != 0) {
			
			opcao = obterOpcaoMenu(scan);
			
			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, arrayList);
				break;
				
			case 2:
				adicionarContatoPosicao(scan, arrayList);
				break;
				
			case 3:
				obtemContatoPosicao(scan, arrayList);
				break;	
				
			case 4:
				obtemContato(scan, arrayList);
				break;
				
			case 5:
				pesquisarUltimoIndice(scan, arrayList);
				break;
				
			case 6:
				pesquisarContatoExiste(scan, arrayList);
				break;
				
			case 7:
				excluirPorPosicao(scan, arrayList);
				break;
				
			case 8:
				excluirContato(scan, arrayList);
				break;
				
			case 9:
				imprimeTamanhoVetor(arrayList);
				break;
				
			case 10:
				limparVetor(arrayList);
				break;
				
			case 11:
				imprimirVetor(arrayList);
				break;

			default:
				break;
			}
		}
		
		System.out.println("Usu�rio digitou 0, programa terminado");
	}

	private static void imprimirVetor(ArrayList<Contato> arrayList) {
		
		System.out.println(arrayList);
	}
	
	private static void limparVetor(ArrayList<Contato> arrayList) {
		
		arrayList.clear();
		
		System.out.println("Todos os contatos do vetor foram exclu�dos");
	}
	
	private static void imprimeTamanhoVetor(ArrayList<Contato> arrayList) {
		
		System.out.println("Tamanho do vetor � de: " + arrayList.size());
	}
	
	private static void excluirContato(Scanner scan, ArrayList<Contato> arrayList) {
		
		int pos = lerInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = arrayList.get(pos);
			
			arrayList.remove(contato);
			
			System.out.println("Contato exclu�do");
						
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> arrayList) {
		
		int pos = lerInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try {
			
			arrayList.remove(pos);
			
			System.out.println("Contato exclu�do");
						
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> arrayList) {
		
		int pos = lerInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = arrayList.get(pos);
			
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			boolean existe = arrayList.contains(contato);
			
			if (existe) {
				System.out.println("Contato existe, seguem dados:");
				System.out.println(contato);
			} else {
				System.out.println("Contato n�o existe");
			}
						
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> arrayList) {
		
		int pos = lerInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = arrayList.get(pos);
			
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do �ltimo �ndice do contato encontrado:");
			pos = arrayList.lastIndexOf(contato);
			
			System.out.println("Contato encontrado na posi��o " + pos);
			
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void obtemContato(Scanner scan, ArrayList<Contato> arrayList) {
		
		int pos = lerInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = arrayList.get(pos);
			
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = arrayList.indexOf(contato);
			
			System.out.println("Contato encontrado na posi��o " + pos);
			
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> arrayList) {
		
		int pos = lerInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try {
			
			Contato contato = arrayList.get(pos);
			
			System.out.println("Contato existe, seguem dados:");
			System.out.println(contato);
			
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> arrayList) {
		
		System.out.println("Criando um contato, entre com as informa��es: ");
		String nome = lerInformacao("Entre com o nome: ", scan);
		String telefone = lerInformacao("Entre com o telefone: ", scan);
		String email = lerInformacao("Entre com o email: ", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		arrayList.add(contato);
		
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}
	
	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> arrayList) {
		
		System.out.println("Criando um contato, entre com as informa��es: ");
		String nome = lerInformacao("Entre com o nome: ", scan);
		String telefone = lerInformacao("Entre com o telefone: ", scan);
		String email = lerInformacao("Entre com o email: ", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		int pos = lerInformacaoInt("Entre com a posicao a adicionar o contato", scan);
		
		try {
			arrayList.add(pos, contato);
			
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
			
		} catch (Exception e) {
			System.out.println("Posi��o inv�lida, contato n�o adicionado");
		}
	}
	
	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> arrayList) {
		
		Contato contato;
		
		for (int i = 1; i <= quantidade; i++) {
			
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("1111111" + i);
			contato.setEmail("contato" + i + "@email.com");
			
			arrayList.add(contato);
		}
	}
}
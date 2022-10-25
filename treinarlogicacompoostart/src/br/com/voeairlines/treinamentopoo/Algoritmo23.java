package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

//Entrar com nome e idade. Imprimir a seguinte saída: Nome e Idade.

public class Algoritmo23 {
	
	Scanner scan = new Scanner(System.in);
	
	public void resultado() {
		System.out.print("Informe seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Informe sua idade: ");
		int idade = scan.nextInt();
		System.out.println("\nResultado: ");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos");
	}
}
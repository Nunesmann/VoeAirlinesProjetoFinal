package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

//Criar um assunto que leia nome, endereço, telefone e mais posteriormente.

       public class Algoritmo08 {
	
		Scanner scan = new Scanner(System.in);
		
		public void  resultado () {
			
			System.out.print("Digite seu nome: ");
			String nome = scan.nextLine();
			System.out.print("Digite seu endereço: ");
			String endereco = scan.nextLine();
			System.out.print( "Digite seu telefone: ");
			String telefone = scan.nextLine();
			System.out.println("\nResultado: ");
			System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone );
		}

}

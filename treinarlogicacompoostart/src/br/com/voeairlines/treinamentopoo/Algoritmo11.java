package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

//Ler um número real e imprimir a terça parte do número.

public class Algoritmo11 {
	
	Scanner  scan = new  Scanner (System.in);
	
	public void resultado () {
		
		System.out.println( "Digite um numero: ");
		double  num1 = scan.nextDouble();
		double resultado = num1/3;
		System.out.println("\nResultado: ");
		System.out.println(resultado);
	}
	

}

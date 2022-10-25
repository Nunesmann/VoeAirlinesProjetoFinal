package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
				System.out.println("Professor escolha um número de 01 a 26 para corrigir o meu trabalho");
				int opcao = leia.nextInt();
				
				switch(opcao) {
				case 1:
					new Algoritmo01().resultado();
					break;
					
				case 2:
					new Algoritmo02().resultado();
					break;
					
				case 3:
					new Algoritmo03().resultado();
					break;
					
				case 4:
					new Algoritmo04().resultado();
					break;
					
				case 5:
					new Algoritmo05().resultado();
					break;
					
				case 6:
					new Algoritmo06().resultado();
					break;
				case 7:
					new Algoritmo07().resultado();
					break;
				case 8:
					new Algoritmo08().resultado();
					break;
				case 9:
					new Algoritmo09().resultado();
					break;
				case 10:
					new Algoritmo10().resultado();
					break;
				case 11:
					new Algoritmo11().resultado();
					break;
				case 12:
					new Algoritmo12().resultado();
					break;
				case 13:
					new Algoritmo13().resultado();
					break;
				case 14:
					new Algoritmo14().resultado();
					break;
				case 15:
					new Algoritmo15().resultado();
					break;
				case 16:
					new Algoritmo16().resultado();
					break;				
				case 17:
					new Algoritmo17().resultado();
					break;
				case 18:
					new Algoritmo18().resultado();
					break;
				case 19:
					new Algoritmo19().resultado();
					break;
				case 20:
					new Algoritmo20().resultado();
					break;
				case 21:
					new Algoritmo21().resultado();
					break;
				case 22:
					new Algoritmo22().resultado();
					break;
				case 23:
					new Algoritmo23().resultado();
					break;
				case 24:
					new Algoritmo24().resultado();
					break;
				case 25:
					new Algoritmo25().resultado();
					break;
				case 26:
					new Algoritmo26().resultado();
					break;
					
				}
				
				leia.close();
	}

}

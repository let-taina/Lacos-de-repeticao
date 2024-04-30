package lacosderepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, 
		 * até que o número zero seja digitado. 
		 * Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.
		 */
		
		Scanner leia = new Scanner (System.in);
		int numero = 1, resultado = 0, contador = 1, positivos=0;
		do {
			System.out.println ("Digite o " + contador++ + "° número inteiro ou 0 para sair: ");
			numero = leia.nextInt();
			
			if (numero > 0 ) {
			positivos = positivos+1;			
			resultado = resultado + positivos;
			}
		}
		
		while (numero != 0);
		leia.close();
		System.out.println ("Programa finalizado. O resultado da soma dos números positivos digitados é: " + resultado);
	

	}

}

package lacosderepeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
		 * mostre na tela quantos números são pares e quantos número são ímpares. 
		 */

		int contador, numero, pares, impares;
		
		pares=0;
		impares=0;
		
		
		Scanner leia = new Scanner (System.in);
		
		
		for ( contador = 1; contador <=10; contador ++) {
			
			System.out.println("Digite o " + contador + "° número:");
			numero = leia.nextInt();
			
			if (numero %2 ==0) {
	
				pares = pares +1;
			}else { 
				impares = impares+1;
				
			}
		}
				
		leia.close();
		System.out.println("Total de números pares: "+ pares);
		System.out.println("Total de números ímpares: "+ impares);
	}

}

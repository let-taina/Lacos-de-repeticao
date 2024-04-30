package lacosderepeticao;

import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		/* Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e 
		 * mostre na tela o total de pessoas cuja idade seja menor que 21 anos e 
		 * o total de pessoas cuja idade seja maior que 50 anos. 
		 * A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
		 */
		
		int idade, jovens, idosos, adulto;
		jovens = 0;
		idosos = 0;
		idade = 0;
		adulto=0;
		
		Scanner leia = new Scanner (System.in);
		
		while ( idade != -1) {
			
			System.out.println("Digite a sua idade: ");
			
			idade = leia.nextInt();
			
		if (idade >= 0 && idade <21  ) {
			jovens = jovens+1;
		
		}else if (idade >=21 && idade <=50) {
			adulto = adulto+1;
			
		}else if (idade > 50 ) {
		idosos= idosos+1;
			
		} else {
		
			
		System.out.println("Total de pessoas menores de 21 anos: "+ jovens);
		System.out.println("Total de pessoas maiores de 50 anos: "+ idosos);
		
		return;
				
		}				
		
	}
			
	leia.close();	
}
}

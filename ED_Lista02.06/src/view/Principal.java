/*
 * Faça uma função recursiva que, dado um vetor, inverta seus valores (O valor que está na 
 * posição zero troca de lugar com o valor que está na úl�ma posição, o valor que está na 
 * posição um troca de lugar com o valor que está na penúl�ma posição e assim por diante).
 */

package view;

import controller.inverterVetor;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe invererVetor
		inverterVetor metodo = new inverterVetor();
		
		int[] vetor1= {1,3,5,7,9,10,2,4,6,8}, vetor2= {1,3,5,7,9,11,10,2,4,6,8};
		
		int tamanho1 = vetor1.length;
		int tamanho2 = vetor2.length;
		int cte;
		
		System.out.print("\nVetor1:    ");
		for(cte=0; cte<tamanho1; cte++) System.out.print(vetor1[cte]+" ");
		
		vetor1 = metodo.inverter(vetor1, tamanho1, 0);
		
		System.out.print("\nInvertido: ");
		for(cte=0; cte<tamanho1; cte++) System.out.print(vetor1[cte]+" ");
		
		System.out.print("\n\nVetor2:    ");
		for(cte=0; cte<tamanho2; cte++) System.out.print(vetor2[cte]+" ");
		
		vetor2 = metodo.inverter(vetor2, tamanho2, 0);
		
		System.out.print("\nInvertido: ");
		for(cte=0; cte<tamanho2; cte++) System.out.print(vetor2[cte]+" ");
	}

}

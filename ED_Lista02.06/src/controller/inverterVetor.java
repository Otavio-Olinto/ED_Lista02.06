package controller;

public class inverterVetor {

	public inverterVetor() {
		super();
	}
	
	public int[] inverter(int[] vetor, int tamanho, int ind) {
		
		int aux;
		
		// O ponto de parada é definido quando o índice que avança no vetor
		// For maior ou igual ao que retrocede no vetor
		if(ind>=tamanho-1) return vetor;
		
		aux=vetor[ind];
		vetor[ind]=vetor[tamanho-1];
		vetor[tamanho-1]=aux;
		
		return inverter(vetor, tamanho-1, ind+1);
	}

}

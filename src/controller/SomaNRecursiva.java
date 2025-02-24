package controller;

public class SomaNRecursiva {

	public SomaNRecursiva() {
		super();
	}
	public double SomaNRec(int n, int i) {
		FatorialRecursivo fr = new FatorialRecursivo();
		if (n == 0 || n == 1) {
		return 2; // Se n for um 0 ou 1, retornara 2 igual ao exemplo do exercício.
	}
		if (i > n) {
			return 0; // Parada para somar um valor nulo.	
		}
		else {
			return (1.0/(fr.FatRec(i))) + SomaNRec(n, i + 1); /* Uma recursiva do 
			 de 1 dividido pelo fatorial de 1 Somando com a funcao recursiva de soma com 
			 o i aumentado. */
		}
}
}
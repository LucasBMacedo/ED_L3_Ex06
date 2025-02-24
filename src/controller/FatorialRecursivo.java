package controller;

public class FatorialRecursivo {

	public FatorialRecursivo() {
		super();
	}
	public int FatRec(int n) {
		if (n == 0) {
			return 1; // Condicao de parada para n igual a 0 retornar 1 na multiplicacao.
		}
		else {
			return n * FatRec(n - 1); /* Funcao recursiva padrao 
			de n multiplicando o resultado da funcao de n menos 1 como parametro. */
		}
	}
}
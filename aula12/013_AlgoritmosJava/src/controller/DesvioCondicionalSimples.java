package controller;

import util.Teclado;

public class DesvioCondicionalSimples {
	public static void main(String[] args) {

		int A, B, X;
		A = Teclado.lerInt("Informe o 1º Número: ");
		B = Teclado.lerInt("Informe o 2º Número: ");
		X = A + B;
		if (X > 10) {
			System.out.println("O valor da soma é " + X);
		}
	}

}

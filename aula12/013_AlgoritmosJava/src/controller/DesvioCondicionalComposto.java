package controller;

import util.Teclado;

public class DesvioCondicionalComposto {
	public static void main(String[] args) {

		int A, B, X;
		A = Teclado.lerInt("Informe o seu Poder de Luta: ");
		B = Teclado.lerInt("Informe o Poder de Luta do seu Inimigo: ");
		X = B * 3;
		if (X >= 8000) {
			System.out.println("O Poder de Luta dele está aumentando... "
					+ "Pffft! *Som do Calculador de Poder de Luta quebrando*");
			System.out.println("O PODER DE LUTA DELE É MAIS DE 8000! - Nappa");
		} else {
			System.out.println("O Poder de Luta calculado do inimigo é de: " + X);
			System.out.println("Fracassado... - Goku");
		}
	}

}

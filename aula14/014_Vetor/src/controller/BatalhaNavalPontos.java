package controller;

import util.Teclado;

public class BatalhaNavalPontos {

	public static void main(String[] args) {

		// primeiro índice de linha, depois o índice da coluna
		String arena[][] = new String[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				arena[i][j] = "Água";
			}
		}

		arena[2][2] = "Barco";
		arena[1][3] = "Submarino";
		arena[3][3] = "Porta-Aviões";
		arena[0][2] = "Navio";

		int linha, coluna, pontos = 0;
		for (int w = 0; w < 4; w++) {
			linha = Teclado.lerInt("Digite a coordenada da linha: ");
			coluna = Teclado.lerInt("Digite a coordenada da coluna: ");

			if (arena[linha][coluna]!="Água")
			{
				pontos = pontos + 1;
			}
			
			System.out.println("Você acertou: " + arena[linha][coluna]);
		}
		System.out.println("Você acertou: " + pontos);
	}
}

package controller;

import util.Teclado;

public class BatalhaNavalPontos {

	public static void main(String[] args) {

		// primeiro �ndice de linha, depois o �ndice da coluna
		String arena[][] = new String[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				arena[i][j] = "�gua";
			}
		}

		arena[2][2] = "Barco";
		arena[1][3] = "Submarino";
		arena[3][3] = "Porta-Avi�es";
		arena[0][2] = "Navio";

		int linha, coluna, pontos = 0;
		for (int w = 0; w < 4; w++) {
			linha = Teclado.lerInt("Digite a coordenada da linha: ");
			coluna = Teclado.lerInt("Digite a coordenada da coluna: ");

			if (arena[linha][coluna]!="�gua")
			{
				pontos = pontos + 1;
			}
			
			System.out.println("Voc� acertou: " + arena[linha][coluna]);
		}
		System.out.println("Voc� acertou: " + pontos);
	}
}

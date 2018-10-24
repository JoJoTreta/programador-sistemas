package controller;
import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Leitura de texto
				String nome;
				nome = Teclado.lerTexto("Digite seu nome: ");

				// Leitura de inteiro
				int nota1;
				nota1 = Teclado.lerInt("Digite sua Nota de Química: ");
				
				// Leitura de inteiro
				int nota2;
				nota2 = Teclado.lerInt("Digite sua Nota de Física: ");

				// Leitura de inteiro
				int nota3;
				nota3 = Teclado.lerInt("Digite sua Nota de Matemática: ");
				
				// Leitura de inteiro
				int nota4;
				nota4 = Teclado.lerInt("Digite sua Nota de Biologia: ");
				
				// Leitura de Ponto Flutuante
				double media;
				media = nota1+nota2+nota3+nota4;
				media = media/4;
				
				System.out.println("Nome do Aluno: " + nome);
				System.out.println("Nota de Química: " + nota1);
				System.out.println("Nota de Física: " + nota2);
				System.out.println("Nota de Matemática: " + nota3);
				System.out.println("Nota de Biologia: " + nota4);
				System.out.println("Média das Notas: " + media);
				
	}

}

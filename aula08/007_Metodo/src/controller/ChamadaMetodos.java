package controller;

public class ChamadaMetodos {
	public static void main(String[] args) {
		System.out.println("Iniciando Programa");
		primeiro();
		System.out.println("Continuando Programa");
		quarto();
		System.out.println("Terminando Programa");
	}
	public static void primeiro() {
		System.out.println("Iniciando m�todo 1");
		segundo();
		System.out.println("Terminando m�todo 1");
		terceiro();
	}
	public static void segundo() {
		System.out.println("Iniciando m�todo 2");
		System.out.println(" Terminando m�todo 2");
	}
	public static void terceiro() {
		System.out.println("Iniciando m�todo 3");
		System.out.println(" Terminando m�todo 3");
	}
	public static void quarto() {
		System.out.println("Iniciando �ltimo m�todo");
		System.out.println(" Calma que t� quase l�...");
		System.out.println("  Terminando �ltimo m�todo... Naaah, ainda n�o...");
		System.out.println("   Terminando �ltimo m�todo");
		System.out.println("Acaboooou...");
	}

}

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
		System.out.println("Iniciando método 1");
		segundo();
		System.out.println("Terminando método 1");
		terceiro();
	}
	public static void segundo() {
		System.out.println("Iniciando método 2");
		System.out.println(" Terminando método 2");
	}
	public static void terceiro() {
		System.out.println("Iniciando método 3");
		System.out.println(" Terminando método 3");
	}
	public static void quarto() {
		System.out.println("Iniciando Último método");
		System.out.println(" Calma que tá quase lá...");
		System.out.println("  Terminando Último método... Naaah, ainda não...");
		System.out.println("   Terminando Último método");
		System.out.println("Acaboooou...");
	}

}

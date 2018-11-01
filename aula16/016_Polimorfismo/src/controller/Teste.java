package controller;

import model.ContaCorrente;
import model.ContaEspecial;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente("Jonattan Diógenes", "0001", "123456", 250);
		System.out.println("Saldo Jonattan");
		System.out.println(cc.calcularSaldo());
		
		ContaEspecial cce = new ContaEspecial("Camila Monteiro", "0034", "987654", 0.50, 500);
		System.out.println("Saldo Camila");
		System.out.println(cce.calcularSaldo());

	}

}

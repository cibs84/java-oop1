package org.lessons.java.shop;

import java.util.Scanner;

public class Main {
	float prezzo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nome Prodotto:");
		String nome = s.nextLine().trim().toLowerCase();
		
		System.out.println("Descrizione Prodotto:");
		String descrizione = s.nextLine().trim();
		
		System.out.println("Prezzo senza iva:");
		float prezzo = Float.parseFloat(s.nextLine());
		
		Prodotto prodotto = new Prodotto(nome, descrizione, prezzo);
		
		System.out.println("Nome Prodotto Completo: " + prodotto.getNomeCompletoProdotto());
		System.out.println("Descrizione Prodotto: " + prodotto.getDescrizione());
		System.out.println("Prezzo Base (iva escl.): " + prodotto.getPrezzoBase());
		System.out.println("Prezzo con Iva: " + prodotto.getPrezzoIvato());
	}

}

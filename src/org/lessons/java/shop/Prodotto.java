package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	int codice;
	String nome;
	String descrizione;
	float prezzo;
	float iva = 22;
	
	public Prodotto(String nome, String descrizione, float prezzo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		
		Random rand = new Random();
		this.codice = rand.nextInt(100000000);
	}
	
	public float getPrezzoBase() {
		return this.prezzo;
	}
	
	public float getPrezzoIvato() {
		return this.prezzo * ( this.iva/100 + 1 );
	}
	
	public String getNomeCompletoProdotto() {
		return this.getCodicePad() + "-" + this.nome;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	
	public String getCodicePad() {
		return String.format("%08d", this.codice);
	}
}

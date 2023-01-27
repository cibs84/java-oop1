package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Conto conto = new Conto();
		
		System.out.println("Inserisci il tuo nome per creare un nuovo conto:");
		conto.setNomeProprietario(scan.nextLine());
		conto.setNumeroConto(rand.nextInt(999)+1);
		
		System.out.println("Ciao " + conto.getNomeProprietario() + ", abbiamo creato il tuo nuovo conto n." + conto.getNumeroConto() + "\n");
		
		while (true) {
			System.out.println("Scegli il numero dell'operazione da effettuare");
			System.out.println("1-Versare | 2-Prelevare | 3-Uscire");
			int operazione = Integer.parseInt(scan.nextLine());
			
			boolean loopExit = false;
			
			switch (operazione) {
				case 1:
					System.out.println("Inserire l'importo da versare:");
					System.out.println(conto.versare(Float.parseFloat(scan.nextLine())));
					break;
				case 2:
					System.out.println("Inserire l'importo da prelevare:");
					System.out.println(conto.prelevare(Float.parseFloat(scan.nextLine())));
					break;
				case 3:
					System.out.println("Arrivederci!");
					loopExit = true;
					break;
	
				default:
					System.out.println("Scelta non corretta. Inserire un numero da 1 a 3 \n");
			}
			if (loopExit) break;
		}
		scan.close();
	}

}

package jana60.bank;

public class Conto {
	int numeroConto;
	String nomeProprietario;
	float saldo;
	
	public Conto() {
		this.saldo = 0;
	}
	
	public String versare(float importo) {
		this.saldo += importo;
		return "Versamento effettuato. Saldo attuale: " + this.getSaldoFormat() + "\n";
	}
	
	public String prelevare(float importo) {
		if ((this.saldo - importo) >= 0) {
			this.saldo -= importo;
			return "Prelievo effettuato. Saldo attuale: " + this.getSaldoFormat() + "\n";
		}
		return "Operazione non possibile: non hai abbastanza credito. Saldo attuale: " + this.getSaldoFormat() + "\n";
	}
	
	public int getNumeroConto() {
		return this.numeroConto;
	}
	
	public String getNomeProprietario() {
		return this.nomeProprietario;
	}
	
	public String getSaldoFormat() {
		return "€ " + this.saldo;
	}
	
	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}
	
	public void setSaldo(float importo) {
		this.saldo = importo;
	}
	
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
}

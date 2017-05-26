package prodotti;

import eccezioni.PrezzoNegativoEccezione;
import eccezioni.ScontoEccezione;
import utility.Utility;

public class ProdottoScontato extends Prodotto {

	private int sconto;
	
	/**
	 * Metodo costruttore
	 * @param nome
	 * @param prezzo
	 * @throws PrezzoNegativoEccezione
	 * @throws ScontoEccezione 
	 */
	public ProdottoScontato(String nome, double prezzo, int sconto) 
			throws PrezzoNegativoEccezione, ScontoEccezione {
		super(nome, prezzo);
		this.setSconto(sconto);
	}

	/**
	 * Metodo costruttore
	 * @param nome
	 * @param descrizione
	 * @param prezzo
	 * @throws PrezzoNegativoEccezione
	 * @throws ScontoEccezione 
	 */
	public ProdottoScontato(String nome, String descrizione, double prezzo, int sconto) 
			throws PrezzoNegativoEccezione, ScontoEccezione {
		super(nome, descrizione, prezzo);
		this.setSconto(sconto);
	}

	/**
	 * Imposta lo sconto del prodotto scontato
	 * @param sconto
	 * @throws ScontoEccezione 
	 */
	private void setSconto(int sconto) throws ScontoEccezione {
		if (sconto>0&&sconto<=90){
			this.sconto = sconto;
		} else {
			throw new ScontoEccezione();
		}
	}
	
	/**
	 * Restituisce il prezzo scontato
	 * @return
	 */
	public double prezzoScontato(){
		return ((100-sconto)/100.0)*getPrezzo();
	}

	@Override
	/**
	 * Restituisce le informazioni sotto forma di stringa
	 */
	public String toString() {
		return super.toString()+" Prezzo scontato: "+Utility.round(prezzoScontato(), 2);

	}
	
}
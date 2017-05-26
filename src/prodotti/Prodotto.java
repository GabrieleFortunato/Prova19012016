package prodotti;

import java.io.Serializable;

import eccezioni.PrezzoNegativoEccezione;
import utility.Utility;

public class Prodotto implements Comparable<Prodotto>,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codice;
	private static int codiceProgressivo = 0;
	private String nome;
	private String descrizione;
	private double prezzo;
	
	/**
	 * Metodo costruttore
	 * @param nome
	 * @param prezzo
	 * @throws PrezzoNegativoEccezione 
	 */
	public Prodotto(String nome, double prezzo) throws PrezzoNegativoEccezione{
		this.setCodice(++codiceProgressivo);
		this.setNome(nome);
		this.setPrezzo(prezzo);
	}	
	
	/**
	 * Metodo costruttore
	 * @param nome
	 * @param descrizione
	 * @param prezzo
	 * @throws PrezzoNegativoEccezione 
	 */
	public Prodotto(String nome, String descrizione, double prezzo) 
			throws PrezzoNegativoEccezione {
		this.setCodice(++codiceProgressivo);
		this.setNome(nome);
		this.setDescrizione(descrizione);
		this.setPrezzo(prezzo);
	}

	/**
	 * Imposta il codice del prodotto
	 * @param id
	 */
	private void setCodice(int codice) {
		this.codice = codice;
	}

	/**
	 * Imposta il nome del prodotto
	 * @param nome
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Imposta la descrizione del prodotto
	 * @param descrizione
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	/**
	 * Imposta il prezzo del prodotto
	 * @param prezzo
	 * @throws PrezzoNegativoEccezione 
	 */
	public void setPrezzo(double prezzo) throws PrezzoNegativoEccezione {
		if (prezzo>0){
			this.prezzo = prezzo;
		} else {
			throw new PrezzoNegativoEccezione();
		}
	}

	/**
	 * Restituisce il prezzo del prodotto
	 * @return
	 */
	public double getPrezzo() {
		return prezzo;
	}

	@Override
	/**
	 * Verifica l'uguaglianza con un altro prodotto in base al codice
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotto other = (Prodotto) obj;
		if (codice != other.codice)
			return false;
		return true;
	}

	@Override
	/**
	 * Restituisce le informazioni sotto forma di stringa
	 */
	public String toString() {
		if (descrizione == null){
			return 
					"Codice: "+codice+" Nome: "+nome+" Prezzo: "+Utility.round(prezzo, 2);
		} else {
			return 
					"Codice: "+codice+" Nome: "+nome+" Descrizione: "+descrizione+
					" Prezzo: "+Utility.round(prezzo, 2);
		}
	}

	@Override
	/**
	 * Confronta con un altro prodotto in base al prezzo
	 */
	public int compareTo(Prodotto p) {
		if (this.prezzo>p.getPrezzo()){
			return -1;
		} else if (this.prezzo<p.getPrezzo()){
			return 1;
		} else {
			return 0;
		}
	}
		
}
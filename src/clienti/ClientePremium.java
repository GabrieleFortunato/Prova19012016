package clienti;

import eccezioni.CodiceFiscalePresenteEccezione;
import eccezioni.NumeroTesseraEccezione;
import eccezioni.NumeroViaggiEccezione;

public class ClientePremium extends Cliente{

	private int numeroTessera;
	private int numeroViaggi;
	
	/**
	 * Metodo costruttore
	 * @param codicefiscale
	 * @param nome
	 * @param cognome
	 * @param dataNascita
	 * @param indirizzo
	 * @param numeroTessera
	 * @param numeroViaggi
	 * @throws CodiceFiscalePresenteEccezione
	 * @throws NumeroTesseraEccezione
	 * @throws NumeroViaggiEccezione
	 */
	public ClientePremium(String codicefiscale, String nome, String cognome, 
			String dataNascita, String indirizzo, int numeroTessera, int numeroViaggi)  
					throws CodiceFiscalePresenteEccezione, NumeroTesseraEccezione, 
					NumeroViaggiEccezione {
		super(codicefiscale, nome, cognome, dataNascita, indirizzo);
		this.setNumeroTessera(numeroTessera);
		this.setNumeroViaggi(numeroViaggi);
	}

	/**
	 * Imposta il numero di tessera del cliente premium
	 * @param numeroTessera
	 * @throws NumeroTesseraEccezione
	 */
	private void setNumeroTessera(int numeroTessera) throws NumeroTesseraEccezione {
		if (numeroTessera>0){
			this.numeroTessera = numeroTessera;
		} else {
			throw new NumeroTesseraEccezione();
		}
	}

	/**
	 * Imposta il numero di viaggi a cui il cliente premium ha preso parte
	 * @param numeroViaggi
	 * @throws NumeroViaggiEccezione
	 */
	private void setNumeroViaggi(int numeroViaggi) throws NumeroViaggiEccezione {
		if (numeroViaggi>0){
			this.numeroViaggi = numeroViaggi;
		} else {
			throw new NumeroViaggiEccezione();
		}
	}

	@Override
	/**
	 * Restituisce le informazioni sotto forma di stringa
	 */
	public String toString() {
		return super.toString()+" Numero tessera: "+numeroTessera+" Numero viaggi: "+numeroViaggi;
	}
		
}
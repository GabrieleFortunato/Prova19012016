package viaggi;

public class Città {

	private String nome;
	private String nazione;
		
	/**
	 * Metodo costruttore
	 * @param nome
	 * @param nazione
	 */
	public Città(String nome, String nazione) {
		super();
		this.setNome(nome);
		this.setNazione(nazione);
	}

	/**
	 * Imposta il nome della città
	 * @param nome
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Imposta la nazione della città
	 * @param nazione
	 */
	private void setNazione(String nazione) {
		this.nazione = nazione;
	}
	
	
	@Override
	/**
	 * Genera l'hashCode in base al nome e alla nazione
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nazione == null) ? 0 : nazione.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
}

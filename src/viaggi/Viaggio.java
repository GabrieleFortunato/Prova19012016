package viaggi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import clienti.Cliente;
import eccezioni.Citt‡NonPresenteEccezione;
import eccezioni.ClienteNonPresenteEccezione;

public class Viaggio implements Iterable<Cliente>{

	private String nome;
	@SuppressWarnings("unused")
	private String dataInizio;
	@SuppressWarnings("unused")
	private String dataFine;
	private HashSet<Citt‡> citt‡;
	private TreeSet<Cliente> clienti;
	
	/**
	 * Metodo costruttore
	 * @param nome
	 * @param dataInizio
	 * @param dataFine
	 */
	public Viaggio(String nome, String dataInizio, String dataFine) {
		super();
		this.setNome(nome);
		this.setDataInizio(dataInizio);
		this.setDataFine(dataFine);
		this.setClienti(new TreeSet<>());
		this.setCitt‡(new HashSet<>());
	}

	/**
	 * Imposta il nome del viaggio
	 * @param nome
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Imposta la data di inizio del viaggio
	 * @param dataInizio
	 */
	private  void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	/**
	 * Imposta la data di fine del viaggio
	 * @param dataFine
	 */
	private  void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}
	
	/**
	 * Imposta le citt‡ visitate durante il viaggio
	 * @param citt‡
	 */
	private  void setCitt‡(HashSet<Citt‡> citt‡) {
		this.citt‡ = citt‡;
	}

	/**
	 * Imposta i clienti del viaggio
	 * @param clienti
	 */
	private  void setClienti(TreeSet<Cliente> clienti) {
		this.clienti = clienti;
	}
	
	/**
	 * Aggiunge una citt‡ da visitare durante il viaggio
	 * @param c
	 */
	public void aggiungiCitt‡(Citt‡ c){
		citt‡.add(c);
	}
	
	/**
	 * Rimuove una citt‡
	 * @param c
	 * @throws Citt‡NonPresenteEccezione 
	 */
	public void rimuoviCitt‡(Citt‡ c) throws Citt‡NonPresenteEccezione{
		if (citt‡.contains(c)){
			citt‡.remove(c);
		} else {
			throw new Citt‡NonPresenteEccezione();
		}
	}
	
	/**
	 * Aggiunge un cliente al viaggio
	 * @param cliente
	 */
	public void aggiungiCliente(Cliente cliente){
		clienti.add(cliente);
	}
	
	/**
	 * Rimuove un cliente dal viaggio
	 * @param cliente
	 * @throws ClienteNonPresenteEccezione
	 */
	public void rimuoviCliente(Cliente cliente) throws ClienteNonPresenteEccezione{
		if (clienti.contains(cliente)){
			clienti.remove(cliente);
		} else {
			throw new ClienteNonPresenteEccezione();
		}
	}
	
	@Override
	/**
	 * Restituisce le informazioni sotto forma di stringa
	 */
	public String toString() {
		return "Viaggio [nome=" + nome + ", clienti=" + clienti + "]";
	}

	@Override
	/**
	 * Itera sui clienti
	 * @return
	 */
	public Iterator<Cliente> iterator() {
		return clienti.iterator();
	}
	
}
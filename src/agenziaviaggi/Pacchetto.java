package agenziaviaggi;

import java.util.Vector;

public class Pacchetto {
	public String codice;
	public String descrizione;
	public int postiTotali;
	public Vector<Prenotazione> prenotazione;
	
	public  Pacchetto( String codice, String descrizione, int postiTotali){
		this.codice=codice;
		this.descrizione=descrizione;
		this.postiTotali=postiTotali;
		this.prenotazione=new Vector<Prenotazione>();
	}
	public void addPrenotazione(Prenotazione p) throws Exception{
		if(this.getPostiDisponibili() > 0 ){
			prenotazione.addElement(p);
			p.setPacchetto(this);
		}else{
			throw new Exception("Non vi sono più posti per questo pacchetto");
		}
	}
	
	public int getPostiDisponibili(){
		return this.postiTotali-prenotazione.size();
	}
	
	public Vector<Prenotazione> getPrenotazione(){
		return prenotazione;
	}
	
	public String getDescrizione(){
		return descrizione;
	}
	
	public int getPostiTotali(){
		return postiTotali;
	}
	
	public String getCodice(){
		return codice;
	}
	@Override
	public String toString() {
		return "Pacchetto [codice=" + codice + ", descrizione=" + descrizione
				+ ", postiTotali=" + postiTotali + ", prenotazioni="+ prenotazione + "]";
	}
}
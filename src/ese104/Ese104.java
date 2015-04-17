package ese104;
import agenziaviaggi.*;

public class Ese104 {

	
	public static void main(String[] args) throws Exception {
		
		Cliente cliente = new Cliente("Mario", "Rossi");
		Filiale filiale = new Filiale(1);
		Pacchetto pacchetto = new Pacchetto("P57", "Weekend a Parigi", 3);
		Prenotazione prenotazione = new Prenotazione("Pr341", 20, cliente, filiale);
		
		pacchetto.addPrenotazione(prenotazione);	
		}
}
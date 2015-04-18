package ese104;
import agenziaviaggi.*;

public class Ese104 {

	
	public static void main(String[] args) throws Exception {
		
		Cliente cliente = new Cliente("Mario", "Rossi");
		Filiale filiale = new Filiale(1);
		Pacchetto pacchetto = new Pacchetto("P57", "Weekend a Parigi", 1);
		Prenotazione prenotazione=new Prenotazione("Pr341", 9, cliente, filiale);
		
		pacchetto.addPrenotazione(prenotazione);	
		
		for(int i=0; i<pacchetto.getPrenotazione().size(); i++){
			System.out.println(pacchetto.getPrenotazione().elementAt(i).toString());		
		}
	}
}
package agenziaviaggi;

public class Filiale {
	
	private int numero;
	
	public Filiale(int numero){
		this.numero=numero;
	}
	
	public int getNumero(){
		return this.numero;
	}

	@Override
	public String toString(){
		return "Filiale [numero=" + numero + "]";
	}
	

}

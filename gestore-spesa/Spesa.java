//questa classe serve per creare un'istanza che rappresenti una spesa
import java.time.LocalDate

public class Spesa{
	private String descrizione;
	private Double importo;
	private LocalDate data;

	//costruttore
	public Spesa(String descrizione, double importo, LocalDate data)	{		
		this.descrizione = descrizione;
		this.importo = importo;
		this.data = data;
	}

	//metodi getter
	public String getDescrizione(){
		return this.descrizione;
	}

	public double getImporto(){
		return this.importo;
	}

	public LocalDate getData(){
		return this.data;
	}
	
	@Override
	public String toString(){
		return data + " | " + descrizione + " | $" + importo;
	}


}

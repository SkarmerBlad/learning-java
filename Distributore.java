import java.util.*;

public class Distributore{
	//variabili private
	private double soldiInseriti;
	private Item arr[];
	private double restoDovuto;

	Scanner in = new Scanner(System.in);

	//costruttore del distributore
	public Distributore(){
		arr = new Item[5];
		for (int i = 0; i < arr.length; i++){
			arr[i] = new Item(i);
		}
		this.soldiInseriti = 0;
		this.restoDovuto = 0;

	}
	
	//funzione per mostrare che elementi ho nel distributore
	public void display(){
		for(Item item : arr){
			System.out.println("numero: " + item.getNumero() + " nome: " + item.getName() + " price: " + item.getPrice() + " quantity: " + item.getQuantity());
		}
	}

	
	public int scegliElemento(){
		System.out.print("inserisci il numero del prodotto che vuoi comprare: ");
		int scelta = in.nextInt();
		System.out.println("hai scelto: " + this.arr[scelta].getName() + "costo: " + this.arr[scelta].getPrice());
		return scelta;
	}

	public void inserisciSoldi(){
		System.out.print("inserisci qui la tua banconota: ");
		double soldi = in.nextDouble();
		this.soldiInseriti = this.soldiInseriti + soldi;
	}

	public void resituisciElemento(int numeroElemento){
		if(this.soldiInseriti >= arr[numeroElemento].getPrice()){
			System.out.println("puoi ritirare l'oggetto");
			this.restoDovuto = this.soldiInseriti - arr[numeroElemento].getPrice();
			this.soldiInseriti = 0;
		}
		else{
			System.out.println("importo non valido inserisci altri soldi.");
		}
	}

	public double getChange(){
		return this.restoDovuto;
	}
	
}

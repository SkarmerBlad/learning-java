import java.util.*;

public class Distributore{
	//variabili private
	private double soldiInseriti;
	private Item arr[];

	Scanner in = new Scanner(System.in);

	//costruttore dell distributore
	public Distributore(){
		arr = new Item[5];
		for (int i = 0; i < arr.length; i++){
			arr[i] = new Item(i);
		}

	}

	public void display(){
		for(Item item : arr){
			System.out.println("numero: " + item.getNumero() + " nome: " + item.getName() + " price: " + item.getPrice() + " quantity: " + item.getQuantity());
		}
	}

	public void inserisciSoldi(){
		System.out.print("inserisci qui la tua banconota: ");
		this.soldiInseriti = in.nextDouble();
	}
	
}

//mi devo creare una classe item che assegna un nome all oggetto e un costo
import java.util.Scanner;

public class Item{
	private String name;
	private double price;
	private int quantity;
	private int numero;

	Scanner in = new Scanner(System.in);

	public Item(int numero){
		System.out.print("inserisci il nome dell'oggetto: ");
		this.name = in.nextLine();

		System.out.print("inserisci il costo dell'oggetto: ");
		this.price = in.nextDouble();

		System.out.print("inserisci la quantità dell'oggetto: ");
		this.quantity = in.nextInt();

		this.numero = numero;
	}

	public String getName(){
		return this.name;
	}

	public double getPrice(){
		return this.price;
	}

	public int getQuantity(){
		return this.quantity;
	}
	
	public int getNumero(){
		return this.numero;
	}

	public void diminuisci(){
		this.quantity = this.quantity - 1;
	}

}

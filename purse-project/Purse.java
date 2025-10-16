import blyat.Coin;
import java.util.ArrayList;


public class Purse{
	private ArrayList<Coin> arr;
	
	public Purse(){
		arr = new ArrayList<>();
	}

	public void addCoin(Coin aCoin){
		this.arr.add(aCoin);
	}	

	public void removeCoin(Coin aCoin){
		boolean trovato = false;
		for  (Coin moneta : arr){
			if (moneta.getValue() == aCoin.getValue()){
				arr.remove(moneta);
				trovato = true;
				System.out.println("moneta eliminata correttamente");
			}
		if(trovato == false){
			System.out.println("moneta non trovata");
		}

		}
	}

	public int findCoin(Coin aCoin){
		for(Coin moneta:arr){
			if(moneta.getValue() == aCoin.getValue()){
				return arr.indexOf(moneta);
			}
		return 0;
		}
	}	
}

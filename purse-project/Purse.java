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

	public boolean removeCoin(Coin aCoin){
		return arr.remove(aCoin);
	}	

	public int find(Coin aCoin){
		return  arr.indexOf(aCoin);
	}
}

package blyat;
public class Coin{
	private int value;
	private String name;

	//costruttore
	public Coin(int value, String name){
		this.value = value;
		this.name = name;
	}

	//getter
	public String getName(){
		return this.name;
	}

	public int getValue(){
		return this.value;
	}
}

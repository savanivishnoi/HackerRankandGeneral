

import java.util.Arrays;
import java.util.stream.IntStream;

public class BlackJackCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new  int[]{1,4,5};
		IntStream x = Arrays.stream(arr);
		

	}

}
enum CardSuit{
	HEARTS,
	DIAMONDS,
	SPADES, 
	CLUBS;	
}

class Cards{
	int value;
	String suit;
	boolean taken = false;
	 Cards(int val, String suit) throws Exception{
		if(value <= 13 && value >0)
			value = val;
		else 
			throw (new Exception("wrong value"));
		this.suit = suit;
		
	}
	 
	 
}
	 
	 class Blackjack{
		 
	 }


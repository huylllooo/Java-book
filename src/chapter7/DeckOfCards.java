// Fig. 7.10
// represents a deck of playing cards.
package chapter7;
import java.util.Random;

public class DeckOfCards {
	private Card[] deck; // array of Card objects
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	// random number generator
	private static final Random randomNumbers = new Random();
	
	// constructor
	public DeckOfCards() {
		 String faces[] = { "A", "2", "3", "4", "5", "6", 
		         "7", "8", "9", "10", "J", "Q", "K" };
		 String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
		 
		 deck = new Card[NUMBER_OF_CARDS];
		 currentCard = 0;
		 
		 // populate deck with Card objects
		 for (int count = 0; count<deck.length; count++)
			 deck[count] = new Card(faces[count%13], suits[count/13]);
	}
	
	// shuffle deck of Cards with one-pass algorithm
	public void shuffle() {
		currentCard = 0;
		
		// for each Card, pick another random Card (0-51) and swap them
		for (int first = 0; first < deck.length; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	// deal one Card
	public Card dealCard() {
		if (currentCard< deck.length)
			return deck[currentCard++];
		else 
			return null;
	}
}

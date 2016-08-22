// Fig. 7.9: Card.java
// Card class represents a playing card.
package chapter7;

public class Card {
	private String face; // face of card ("Ace", ...)
	private String suit; // suit of card ("Heart", ...)
	// 2 args constructor
	public Card(String cardFace, String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}
	
	// return String representation of Card
	public String toString() {
		return face + "-" + suit;
	}
}

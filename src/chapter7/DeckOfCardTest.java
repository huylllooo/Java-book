// Fig. 7.11
// Card shuffling and dealing.
package chapter7;

public class DeckOfCardTest {

	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		// print all 52 cards
		for (int i = 1; i<=52; i++) {
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if (i%4 == 0)
				System.out.println();
		}
	}

}

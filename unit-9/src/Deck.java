import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	private int dealAmount = 10;
	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;
	private List<Card> cardBase;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (String i:suits) {
			int k = 0;
			for (String j:ranks) {
				Card currentCard = new Card(j,i,values[k]);
				cards.add(currentCard);
				k++;
			}
		}
		cardBase = new ArrayList<Card>();
		
		size=cards.size();
		for (Card i : cards) {
			cardBase.add(i);
		}
		System.out.println(cardBase.equals(cards));
		System.out.println(size);
		shuffle();
	}
	
	public List<Card> cardReturn(){
		return cards;
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size==0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		size = cards.size();
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		cards.clear();
		for (Card i:cardBase) {
			cards.add(i);
		}
		for (int k=size()-1; k>0;k--) {
			int r = (int) (Math.random()*k);
			System.out.println("random is "+r);
			Card cardsCurrent = cards.get(k);
			cards.set(k, cards.get(r));
			cards.set(r, cardsCurrent);
		}
		size();
		System.out.println(cardBase.size());
		System.out.println(size);
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (!isEmpty()) {
			size--;
			Card topDeck = cards.get(size);
			cards.remove(size);
			return topDeck;
		}
		return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\n\nUndealt cards: \n\n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + "\n";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
//				rtn = rtn + "\n";
			}
		}
		shuffle();
		
		rtn = rtn + "\n\nDealt cards: \n\n";
		for (int i = 0; i<dealAmount;i++) {
			rtn = rtn + deal();
			rtn = rtn + "\n"; 
		}
		
		return rtn;
	}
}

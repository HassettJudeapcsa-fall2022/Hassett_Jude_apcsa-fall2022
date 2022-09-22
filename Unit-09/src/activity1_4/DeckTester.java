package activity1_4;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck deck1 = new Deck(new String[] {"a", "b", "c"}, new String[] {"hearts", "aces", "spades"}, new int[] {1,2,3});
		System.out.println(deck1.deal());
		System.out.println(deck1);
		System.out.println(deck1.size());
		System.out.println(deck1.isEmpty());
		Deck deck2 = new Deck(new String[] {"d", "e", "f"}, new String[] {"hearts", "aces", "spades"}, new int[] {1,2,3});
		System.out.println(deck2.deal());
		System.out.println(deck2);
		System.out.println(deck2.size());
		System.out.println(deck2.isEmpty());
		Deck deck3 = new Deck(new String[] {"g", "h", "i"}, new String[] {"diamonds", "hearts", "aces", "spades"}, new int[] {1,2,3});
		System.out.println(deck3.deal());
		System.out.println(deck3);
		System.out.println(deck3.size());
		System.out.println(deck3.isEmpty());
		
	}
}

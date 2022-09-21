package activity1_4;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card AceSpade = new Card("Ace", "Spades", 1);
		System.out.println(AceSpade);
		Card NineHeart = new Card("Nine", "Hearts", 9);
		System.out.println(NineHeart);
		Card TenClub = new Card("Ten", "Clubs", 10);
		System.out.println(TenClub);
		
	}
}

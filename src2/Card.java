import java.util.List;

import javafx.scene.image.Image;

import java.util.Arrays;

public class Card {
	
	private String cardType, cardSuit; // cardType = 2,3,4,5,6,7,8,9,10,J,Q,K,A suit = hears, clubs, diamonds and spades
	private Image cardImage;
	
	// constructor
	public Card(String cardType, String cardSuit) {
		setCardType(cardType);
		setCardSuit(cardSuit);
		String fileName = cardType + "_of_" + cardSuit + ".jpg";
		cardImage = new Image("file:///C:/Users/Pedro/eclipse-workspace/DeckOfCards/Images/" + fileName);
	}
	
	// lets create a list of valid card types
	public static List<String> getValidCardTypes(){
		List<String> validCardType = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");
		return validCardType;
	}
	
	public void setCardType(String cardType) {
		// this makes it so however we enter a valid suit where it be all upper or lower or some upper and some lower
		// we convert out valid card type to the format defined above
		cardType = cardType.substring(0,1).toUpperCase() + cardType.substring(1, cardType.length()).toLowerCase();
		List<String> validCardTypes = getValidCardTypes();
		if (validCardTypes.contains(cardType)) {
			this.cardType = cardType;
		}
		else {
			throw new IllegalArgumentException("Please enter a card type from " + validCardTypes);
		}
		
	}
	
	// we also need some validation for our suits which will be Hearts, Diamonds, Cloves and Spades
	public static List<String> getValidCardSuits(){
		List<String> validCardSuit = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
		return validCardSuit;
	}

	
	
	public void setCardSuit(String cardSuit) {
		// this makes it so however we enter a valid suit where it be all upper or lower or some upper and some lower
		// we convert out valid card type to the format defined above
		cardSuit = cardSuit.substring(0,1).toUpperCase() + cardSuit.substring(1, cardSuit.length()).toLowerCase();
		List<String> validCardSuit = getValidCardSuits();
		if (validCardSuit.contains(cardSuit)) {
			this.cardSuit = cardSuit;
			}
		else {
			throw new IllegalArgumentException("Please enter a card suit from " + validCardSuit);
			}
	}
	
	public String cardToString() {
			return cardType + " of " + cardSuit;
			
		}
	
	
	
	// we are interested in know what cardType we have
	
	public String getCardType() {
		return cardType;
	}
	
	// we are also interested in knowing the suit of the card
	
	public String getCardSuit() {
		return cardSuit;
	}
	
	// images are private, lets make them public
	public Image getCardImage() { // card front image
		return cardImage;
		
		
	}
	
	 


}

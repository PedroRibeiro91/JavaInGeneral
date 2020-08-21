import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.scene.image.Image;

public class DeckOfCards {
	
	private ArrayList<Card> deck; // this ArrayList object saves a Card object and its name is deck
	private Image cardBackImage;
	
	
	public DeckOfCards(ArrayList<Card> deck) {
		this.deck = deck;
		cardBackImage = new Image("file:///C:/Users/Pedro/eclipse-workspace/DeckOfCards/Images/CardBack.jpg");
		
	}
	 
	 
	public DeckOfCards() {
		// our deck of cards needs the suits and types of cards we want to create
		List<String> cardTypes = Card.getValidCardTypes();
		List<String> cardSuits = Card.getValidCardSuits();
		
		// now we can create the deck going through the valid card types and suits
		deck = new ArrayList<>(); // initialize the deck which is and an empty ArrayList object
		
		for(String type:cardTypes) 
		{
			for(String suit:cardSuits) 
			{
				deck.add(new Card(type,suit)); // in each iteration we add a new Card object to our deck
			}
		}
		cardBackImage = new Image("file:///C:/Users/Pedro/eclipse-workspace/DeckOfCards/Images/CardBack.jpg");
	}
	
	// we might want to look at the card back 
	public Image getCardBackImage() {
		return cardBackImage;
	}
	
	// or maybe change cardback
	public void setCardBackImage(Image cardBackImage) {
		this.cardBackImage = cardBackImage;
	}
	

	// we might want to take a look at a specific card in our deck
	
	public String showCard(int position) {
		return deck.get(position).cardToString();
	}
	
	// or lets take a look at the whole deck
	
	public void showDeck() {
		for (Card card:deck) {
			System.out.println(card.cardToString());	
		}
	}
	
	// deal card method
	
	public Card dealTopCard() {
		if (deck.size() > 0) { // if the deck still has cards
			return deck.remove(0); // return the card removed from the top i.e. card on position zero
		}
		else {
			return null; // deck run out of cards
		}
		
	}
	
	// we can deal cards the problem is we know the order of the cards
	// so we need to shuffle our deck
	
	// shuffle deck
	public void shuffleDeck() {
		
		Collections.shuffle(deck);
	}

	
	
}

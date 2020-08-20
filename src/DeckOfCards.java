import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
	
	private ArrayList<Card> deck; // this ArrayList object saves a Card object and its name is deck
	// private Image cardBackImage;
	
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
	
	
}

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class DeckViewController implements Initializable {

	@FXML private Button dealCardButton;
	@FXML private ImageView DeckPile;
	@FXML private ImageView cardUP;
	private DeckOfCards deck;
	
 	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		deck = new DeckOfCards();
		
		DeckPile.setImage(deck.getCardBackImage());
		
	}
	
	@FXML public void dealCardButtonPushed() {
		
		cardUP.setImage(deck.dealTopCard().getCardImage());
	}
	
	@FXML public void shuffleDeckButtonPush() {
		deck.shuffleDeck();
		
	}

}

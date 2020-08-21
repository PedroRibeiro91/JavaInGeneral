import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage PrimaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("DeckView.fxml"));
		Scene scene = new Scene(root);
		
		PrimaryStage.setTitle("Deck Viewer");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
	}

}

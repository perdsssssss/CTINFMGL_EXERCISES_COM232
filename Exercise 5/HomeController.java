import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {

    @FXML
    Label homelabel;

    public void displayName(String username){

        homelabel.setText("Welcome, " + username);
    }
}
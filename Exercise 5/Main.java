import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Make this my main page
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));

        // Sets title of main page
        primaryStage.setTitle("WELCOME TO CEBU PACIFIC!");

        // Sets window size
        primaryStage.setScene(new Scene(root, 755, 470));

        // Display page
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
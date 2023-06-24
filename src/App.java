import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
 

public class App extends Application{

    Stage window;
    public static void main(String[] args) throws Exception {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Auth");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10)); // padding of grid
        grid.setVgap(8); // vertical padding
        grid.setHgap(10);

        // name label
        Label nameLabel = new Label("Username: ");
        nameLabel.setId("bold-label");

        GridPane.setConstraints(nameLabel, 0, 0);

        // name input
        TextField nameInput = new TextField();
        nameInput.setPromptText("username");
        GridPane.setConstraints(nameInput, 1, 0);

        // password label
        Label passLabel = new Label("Password: ");
        GridPane.setConstraints(passLabel, 0, 1);

        // pass input
        TextField passInput = new TextField();
        passInput.setPromptText("password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log In");
        GridPane.setConstraints(loginButton, 1, 2);

        Button signUpButton = new Button("Sign up");
        GridPane.setConstraints(signUpButton, 1, 3);
        signUpButton.getStyleClass().add("button-blue");

        


        grid.getChildren().addAll(nameInput, nameLabel, passInput, passLabel, loginButton,signUpButton);

        Scene scene = new Scene(grid, 300, 200);
        scene.getStylesheets().add("viper.css");
        window.setScene(scene);
        window.show();
    }
}


package GUI;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author abdulhakimdarman
 * 
 * login menu....
 *
 */

public class Login extends Application {
	
	/**
	 * We are calling the stage window for it to be easier to understand our code
	 * 
	 * We are creating two Scenes one for Admin and one for User.
	 *
	 */
	
	Stage window;

	
	public static void main(String[] args) {
		/**
		 * Launching into Javafx
		 */
		launch(args);
		
		// TODO User enters the user name then searches the database if it is there.
		
		// TODO User enters the password then searches the database if it is there.
		
		// TODO If the user enters the correct password and correct username then the application stage will begin.
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		GridPane userGrid = new GridPane();
		userGrid.setPadding(new Insets(10, 10, 10, 10));
		userGrid.setVgap(8);
		userGrid.setHgap(10);
		
		//Name label
		Label nameLabel = new Label("Username: ");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//Name input
		TextField nameInput = new TextField("adarman1");
		GridPane.setConstraints(nameInput, 1, 0);
	
		//Pass Label for User
		Label passLabel = new Label("Password: ");
		GridPane.setConstraints(passLabel, 0, 1);
		
		//Password Input
		PasswordField passInput = new PasswordField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 1);
		
		//Login Button
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 2);
		
		//Back button which takes the user back to the main menu
		Button backButton = new Button("Go Back");
		GridPane.setConstraints(backButton, 1, 3);
		backButton.setOnAction(e -> {
			MainMenu mm = new MainMenu();
			try {
				mm.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	
		
		

		userGrid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput,
				loginButton, backButton);
		Scene userScene = new Scene(userGrid, 300, 300);
		

		userGrid.setAlignment(Pos.CENTER);
		window.setScene(userScene);
		window.setTitle("User Login");
		window.show();
	
	}
	

}

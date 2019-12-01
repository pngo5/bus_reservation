package Classroom.src.MainMenu;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * 
 * @author abdulhakimdarman
 * 
 * login menu..
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
	
	Scene adminLogin, userLogin;
	
	Button adminLoginButton, userLoginButton , switchToUser, switchToAdmin;
	
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
		
		window.setTitle("The Bus Resvoir");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		
		//Name label
		Label nameLabel = new Label("Username: ");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//Name input
		TextField nameInput = new TextField("adarman1");
		GridPane.setConstraints(nameInput, 1, 0);
		
		//Pass Label
		Label passLabel = new Label("Password: ");
		GridPane.setConstraints(passLabel, 0, 1);
		
		
		//Password Input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 1);
		
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 2);
		
		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
		
		Scene scene = new Scene(grid, 300, 200);
		
		window.setScene(scene);
		
		window.show();
		
	}

}

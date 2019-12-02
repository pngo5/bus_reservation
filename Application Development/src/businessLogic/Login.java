package businessLogic;
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
	
	Scene adminScene, userScene;
	
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

		GridPane userGrid = new GridPane();
		userGrid.setPadding(new Insets(10, 10, 10, 10));
		userGrid.setVgap(8);
		userGrid.setHgap(10);
		
		GridPane adminGrid = new GridPane();
		adminGrid.setPadding(new Insets(10, 10, 10, 10));
		adminGrid.setVgap(8);
		adminGrid.setHgap(10);
		
		//Name label
		Label nameLabel = new Label("Username: ");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//Name label for admin
		Label nameLabelAdmin = new Label("Username: ");
		GridPane.setConstraints(nameLabelAdmin, 0, 0);
		
		
		//Name input
		TextField nameInput = new TextField("adarman1");
		GridPane.setConstraints(nameInput, 1, 0);
		
		TextField nameInputAdmin = new TextField("adarman1");
		GridPane.setConstraints(nameInputAdmin, 1, 0);
	
		//Pass Label for User
		Label passLabel = new Label("Password: ");
		GridPane.setConstraints(passLabel, 0, 1);
		
		//Pass Label for Admin
		Label passLabelAdmin = new Label("Password: ");
		GridPane.setConstraints(passLabelAdmin, 0, 1);
				
		//Password Input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 1);
		
		//Password Input
		TextField passInputAdmin = new TextField();
		passInputAdmin.setPromptText("password");
		GridPane.setConstraints(passInputAdmin, 1, 1);
				
		
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 2);
		
		Button loginButtonAdmin = new Button("Log In");
		GridPane.setConstraints(loginButtonAdmin, 1, 2);
		
		//Button to log into admin
		switchToAdmin = new Button("Admin Login");
		GridPane.setConstraints(switchToAdmin, 2, 1);
		switchToAdmin.setOnAction(e -> {
			window.setScene(adminScene);
			window.setTitle("Admin Login");
		});
		

		//Button to switch to user
		switchToUser = new Button("User Login");
		GridPane.setConstraints(switchToUser, 2, 1);
		switchToUser.setOnAction(e -> {
			window.setScene(userScene);
			window.setTitle("User Login");
		});
		
		userGrid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, switchToAdmin);
		userScene = new Scene(userGrid, 300, 300);
		
		
		adminGrid.getChildren().addAll(nameLabelAdmin, nameInputAdmin, passLabelAdmin, passInputAdmin, loginButtonAdmin, switchToUser);
		adminScene = new Scene(adminGrid, 300, 300);
		
		
		window.setScene(userScene);
		window.setTitle("User Login");
		window.show();
	}
}

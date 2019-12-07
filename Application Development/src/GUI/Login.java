
package GUI;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
		window.setResizable(false);
		window.getIcons().add(new Image("icon.png"));
          
		GridPane userGrid = new GridPane();
		userGrid.setPadding(new Insets(10, 10, 10, 10));
		userGrid.setVgap(8);
		userGrid.setHgap(10);
		
		
		
	      VBox inputGrid = inputs();
		

		userGrid.getChildren().addAll(inputGrid);
		Scene userScene = new Scene(userGrid, 500, 500);
		userScene.getStylesheets().add("Layout.css");
		userGrid.setAlignment(Pos.CENTER);
		window.setScene(userScene);
		window.setTitle("User Login");
		window.show();
	
	}
	
	
	public VBox inputs() {
		
		VBox input = new VBox();
		input.setAlignment(Pos.CENTER);

		  Label headerLabel = new Label("Login");
	      headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 40));
	      //headerLabel.setMinSize(300, 300);
	      input.setAlignment(Pos.TOP_CENTER);
	      input.setMargin(headerLabel, new Insets(20, 0,20,0));
	      
		//Name input
		TextField nameInput = new TextField();
		nameInput.setPromptText("Username");
		nameInput.setMinSize(100, 20);
		nameInput.setAlignment(Pos.CENTER);
		input.setMargin(nameInput, new Insets(5, 5, 5, 5) );
		
	
		
		//Password Input
		PasswordField passInput = new PasswordField();
		passInput.setMinSize(100, 20);
		passInput.setPromptText("password");
		passInput.setAlignment(Pos.CENTER);
		input.setMargin(passInput, new Insets(5, 5, 5, 5) );

		
		//Login Button
		Button loginButton = new Button("Log In");
		loginButton.setMinSize(200, 20);
		loginButton.setAlignment(Pos.CENTER);
		input.setMargin(loginButton, new Insets(5, 5, 5, 5) );
		loginButton .setOnAction(e -> {
			MainApplication ma = new MainApplication();
			try {
				ma.start(window);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	
		Button forgotPasswordButton = new Button("Forgot Password");
		forgotPasswordButton.setMinSize(200, 20);
		forgotPasswordButton.setAlignment(Pos.CENTER);
		input.setMargin(forgotPasswordButton, new Insets(5, 5, 5, 5) );
		forgotPasswordButton.setOnAction(e -> {
			ForgetPassword m1 = new ForgetPassword();
			try {
				m1.start(window);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
	
		
		//Back button which takes the user back to the main menu
		Button backButton = new Button("Go Back");
		backButton.setMinSize(200, 20);
		backButton.setAlignment(Pos.CENTER);
		input.setMargin(backButton, new Insets(5, 5, 5, 5) );
		backButton.setOnAction(e -> {
			MainMenu mm = new MainMenu();
			try {
				mm.start(window);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		input.getChildren().addAll(headerLabel,nameInput, passInput, loginButton, forgotPasswordButton, backButton);
		
		return input;
		
	}
	

}

package GUItest;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainMenu extends Application {

     Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Main Menu - Bus System");
        window.setScene(MainMenuScene());
        window.show();
    }
    /**
     * Main Menu
     * @return
     */
    
    public Scene MainMenuScene() {
     
        FlowPane layout = new FlowPane();
        
        Button mainToLogin = new Button("Login Button");
        //Button switches scene for the user to login
        mainToLogin.setOnAction(e -> {
        	window.setScene(loginForm());
        	window.setTitle("Login");
        });
        
        // Creating Registration button in main menu.
        Button mainToRegistration = new Button("Registration Button"); 
        mainToRegistration.setOnAction(e -> {
        	window.setScene(registrationGrid());
        	window.setTitle("Registration");
        });

        
        layout.setHgap(25);
        layout.getChildren().addAll(mainToLogin, mainToRegistration);
        
        layout.setAlignment(Pos.CENTER);
        
        
        Scene scene = new Scene(layout, 400, 400);
        
        return scene;
    	
    }
    
    /**
     * Creates the Registration form
     * @return
     */
    
    public Scene registrationGrid() {
    	//Creating gridPane
		GridPane gridPane = new GridPane();
		
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.setVgap(10);
		
		gridPane.setHgap(10);
		
		gridPane.setPadding(new Insets(50, 50, 50, 50));
		
		 // Add Column Constraints
		

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        
        addInputs(gridPane);

        Scene scene = new Scene(gridPane, 1000, 500);

        return scene;
	}
	
    /**
     * Adds the inputs to the registration form such as textfields for ssn, zip etc.
     * @param gridPane
     */
	public void addInputs(GridPane gridPane) {
		        // Add Header
		        Label headerLabel = new Label("Registration Form");
		        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		        gridPane.add(headerLabel, 0,0,2,1);
		        GridPane.setHalignment(headerLabel, HPos.CENTER);
		        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

		        // Add First Name Label
		        Label firstNameLabel = new Label("First Name : ");
		        gridPane.add(firstNameLabel, 0,1);

		        // Add Name First Name Text Field
		        TextField firstNameText = new TextField();
		        firstNameText.setPrefHeight(20);
		        gridPane.add(firstNameText, 1,1);
		        
		        // Add Last Name Label
		        Label lastNameLabel = new Label("Last Name : ");
		        gridPane.add(lastNameLabel, 0,2);
		        
		        // Add Name Last Name Text Field
		        TextField lastNameText = new TextField();
		        lastNameText.setPrefHeight(20);
		        gridPane.add(lastNameText, 1, 2);
		        
		        // Add Address Label
		        Label addressLabel = new Label("Address : ");
		        gridPane.add(addressLabel, 0,3);
		        
		        // Add Address Text Field
		        TextField addressText = new TextField();
		        addressText.setPrefHeight(20);
		        gridPane.add(addressText, 1,3);
		        
		        // Add ZIP Label
		        Label zipLabel = new Label("ZIP : ");
		        gridPane.add(zipLabel, 0,4);
		        
		        // Add zip Text Field
		        TextField zipText = new TextField();
		        zipText.setPrefHeight(20);
		        gridPane.add(zipText, 1,4);
		        
		        // Add state Label
		        Label stateLabel = new Label("State Name : ");
		        gridPane.add(stateLabel, 0,5);
		        
		        //Add state drop down menu
		        ChoiceBox<String> stateBox = new ChoiceBox();
		        stateBox.getItems().addAll("Alabama", "Alaska", "American Samoa", "Arizona", 
		        		"Arkansas", "California", "Colorado", "Connecticut", "Delaware", 
		        		"District of Columbia", "Florida", "Georgia", "Guam", "Hawaii", "Idaho", 
		        		"Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", 
		        		"Maryland", "Massachusetts", "Michigan", "Minnesota", 
		        		"Minor Outlying Islands", "Mississippi", "Missouri", "Montana", "Nebraska", 
		        		"Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", 
		        		"North Dakota", "Northern Mariana Islands", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", 
		        		"Puerto Rico", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", 
		        		"U.S. Virgin Islands", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", 
		        		"Wisconsin", "Wyoming");
		        gridPane.add(stateBox, 1, 5);
		        
		        
		        //Add Email Label
		        Label emailLabel = new Label("Email : ");
		        gridPane.add(emailLabel, 0,6);
		        
		        //Add email Text Field
		        TextField emailText = new TextField();
		        emailText.setPrefHeight(20);
		        gridPane.add(emailText, 1,6); 
		        
		        //Add Username Label
		        Label usernameLabel = new Label("Username : ");
		        gridPane.add(usernameLabel, 0,7);
		        
		        //Add email Username text
		        TextField usernameText = new TextField();
		        usernameText.setPrefHeight(20);
		        gridPane.add(usernameText, 1,7); 
		        
		        //Add Password Label
		        Label passwordLabel = new Label("Password : ");
		        gridPane.add(passwordLabel, 0,8);
		        
		        //Add password text
		        PasswordField passwordText = new PasswordField();
		        passwordText.setPrefHeight(20);
		        gridPane.add(passwordText, 1,8); 
		        
		        //Add SSN label
		        Label ssnLabel = new Label("SSN: ") ;
		        gridPane.add(ssnLabel, 0, 9);
		        
		        //Add SSN text field
		        TextField ssnTextField = new TextField();
		        gridPane.add(ssnTextField, 1, 9);
		        
		        //Add Security Question Label
		        Label securityQLabel = new Label("Security Question");
		        gridPane.add(securityQLabel, 0, 10);
		        
		        //Add Security Question ChoiceBox
		        ChoiceBox<String> securityQChoiceBox = new ChoiceBox();
		        securityQChoiceBox.getItems().addAll("What is the name of your first teacher",
		        		"What is the name of your first pet",
		        		"What is the name of your School"); 
		        gridPane.add(securityQChoiceBox, 1, 10);
		        
		      
		        //Add Security Answer Label
		        Label securityALabel = new Label("Security Answer");
		        gridPane.add(securityALabel, 0, 11);
		        
		        //Add Security Answer Field
		        TextField securityATextField = new TextField();
		        gridPane.add(securityATextField, 1, 11);
		        
		        Button registerButton = new Button("Register !");
		        
		        registerButton.setOnAction(e -> window.setScene(loginForm()));
		        
		        gridPane.add(registerButton, 1, 12);
		        
		        
		        
		       
		      
	}
	/**
	 * Login form
	 * Username:
	 * Password:
	 * @return
	 */
	
	public Scene loginForm(){
		
		GridPane userGrid = new GridPane();
		userGrid.setPadding(new Insets(20, 20, 20, 20));
		userGrid.setVgap(8);
		userGrid.setHgap(10);
		userGrid.setAlignment(Pos.CENTER);
		
		//Name label
		Label nameLabel = new Label("Username: ");
		GridPane.setConstraints(nameLabel, 0, 1);
		
		//Name input
		TextField nameInput = new TextField("adarman1");
		GridPane.setConstraints(nameInput, 1, 1);
	
		//Pass Label for User
		Label passLabel = new Label("Password: ");
		GridPane.setConstraints(passLabel, 0, 2);
		
		//Password Input
		PasswordField passInput = new PasswordField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 2);
				
		//Creating Login Button
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 3);
		
		//Create Back Button
		Button backButton = new Button("Go Back");
		GridPane.setConstraints(backButton, 1, 4);
		backButton.setOnAction(e -> goBackToMainMenu());
		
		
		//Create Forgot Password Button
		Button forgotPassword = new Button("Forgot Password");
		GridPane.setConstraints(backButton, 1, 5);
		
		
		userGrid.getChildren().addAll(nameLabel, nameInput, passLabel, 
				passInput, loginButton, backButton, forgotPassword);
		
		Scene loginForm = new Scene(userGrid, 500, 500);
		
		return loginForm;
		
	}
	/**
	 * Button for returning back to main menu
	 */
	public void goBackToMainMenu() {
		window.setScene(MainMenuScene());
		window.setTitle("Main Menu");
	}

}
package GUI;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class RegistrationUI extends Application {
	
	Button registerButton;
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * 	private String newUserName;
	private String newPassword;
	private String firstName;
	private String lastName;
	private String zip;
	private String state;
	private String email;
	private String ssn;
	private String secQuestions;
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		window.setTitle("Bus Resvoir - Registration");
		
		GridPane gridPane = registrationGrid();
		
        // Add UI controls to the registration form grid pane
        addInputs(gridPane);
        
        // Create a scene with registration form grid pane as the root node
        Scene scene = new Scene(gridPane, 600, 350);
        
        //Making the window fit the program

        
        // Set the scene in primary stage	
        window.setScene(scene);
        
        window.show();
		
		
		
	}
	
	public GridPane registrationGrid() {
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

        return gridPane;
	}
	
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
		        TextField lastNameText = new TextField("Last Name");
		        lastNameText.setPrefHeight(20);
		        gridPane.add(lastNameText, 1, 2);
		        
		        // Add zip Label
		        Label zipLabel = new Label("zip : ");
		        gridPane.add(zipLabel, 0,3);
		        
		        // Add zip Text Field
		        TextField zipText = new TextField();
		        zipText.setPrefHeight(20);
		        gridPane.add(zipText, 1,3);
		        
		        // Add state Label
		        Label stateLabel = new Label("State Name : ");
		        gridPane.add(stateLabel, 0,4);
		        
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
		        gridPane.add(stateBox, 1, 4);
		        
		        
		        //Add Email Label
		        Label emailLabel = new Label("Email : ");
		        gridPane.add(emailLabel, 0,5);
		        
		     // Add email Text Field
		        TextField emailText = new TextField();
		        zipText.setPrefHeight(20);
		        gridPane.add(emailText, 1,5);
		        
		        

		        
		        

	}

	
	
	

}

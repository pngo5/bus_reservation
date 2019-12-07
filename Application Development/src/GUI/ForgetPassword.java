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
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class ForgetPassword extends Application {
 	Stage window;
 	
     

 public static void main(String[] args) {
	 launch(args);
 }


@Override
public void start(Stage primaryStage) throws Exception {
	    window = primaryStage;
	    window.setTitle("Forgot Password Validation Form");
	    window.getIcons().add(new Image("icon.png"));
	    
	    
	    GridPane grid = new GridPane();
	    grid.setPadding(new Insets(10,10,10,10));
	    grid.setAlignment(Pos.CENTER);
	    grid.setVgap(10);
	    grid.setHgap(10);
	    
	    
	    Label headerLabel = new Label("Forgot Password Validation Form");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        grid.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(9, 1,9,1));
	    
	    Label username = new Label("Username");
	    grid.add(username,0,1);
	    
	    TextField testUsername = new TextField();
	    testUsername.setPromptText("Username");
	    grid.add(testUsername,1,1);
	    
	       //Add Security Question Label
        Label securityQLabel = new Label("Security Question");
        grid.add(securityQLabel, 0, 3);
        
        //Add Security Question ChoiceBox
        ChoiceBox<String> securityQChoiceBox = new ChoiceBox();
        securityQChoiceBox.getItems().addAll("What is the name of your first teacher",
        		"What is the name of your first pet",
        		"What is the name of your School"); 
        securityQChoiceBox.setValue("What is the name of your first teacher");
        grid.add(securityQChoiceBox, 1, 3);
        
      
        //Add Security Answer Label
        Label securityALabel = new Label("Security Answer");
        grid.add(securityALabel, 0, 5);
        
        PasswordField securityQuestion = new PasswordField();
        securityQuestion.setPrefHeight(20);
        securityQuestion.setPromptText("Security Answer");
        grid.add( securityQuestion, 1,5); 
        
        
        Button loginButton = new Button("Change Password");
        loginButton.setAlignment(Pos.CENTER);
        grid.add(loginButton,1,6); 
        loginButton.setOnAction(e -> {
			ChangingPassword m1 = new ChangingPassword();
			try {
				m1.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
        
     
        
  
        Scene scene = new Scene(grid, 500,500);
    	scene.getStylesheets().add("Layout.css");
        window.setScene(scene);
	    
	    window.show();
	
}
}
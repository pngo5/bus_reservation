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


public class ChangingPassword extends Application {
	Stage window;



	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Changing Password");
		window.setResizable(false);
		window.getIcons().add(new Image("icon.png"));


		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);


		Label headerLabel = new Label("Changing Password");
		headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		grid.add(headerLabel, 0,0,2,1);
		GridPane.setHalignment(headerLabel, HPos.CENTER);
		GridPane.setMargin(headerLabel, new Insets(9, 1,9,1));

		Label newPassword = new Label("New Password: ");
		grid.add(newPassword,0,1);

		PasswordField newPasswordField = new PasswordField();
		newPasswordField.setPromptText("New Password");
		grid.add(newPasswordField,1,1);

		//Add Security Answer Label
		Label securityALabel = new Label("Confirm Password: ");
		grid.add(securityALabel, 0, 2);

		PasswordField confirmPassword = new PasswordField();
		confirmPassword.setPrefHeight(20);
		confirmPassword.setPromptText("Confirm Password");
		grid.add( confirmPassword, 1,2); 


		Button changePassword= new Button("Change Password");
		changePassword.setAlignment(Pos.CENTER);
		grid.add(changePassword,1,3);
		changePassword.setOnAction(e -> {
			if (changePassword.getText().isEmpty()|| confirmPassword.getText().isEmpty()) {
				AlertBox.display("ERROR!", "You are missing some inputs!");
			}
			else {
				AlertBox.display("Password Changed!", "Congratulations you change your password!");
				Login m1 = new Login();
				try {
					m1.start(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
				);





		Scene scene = new Scene(grid, 500,500);
		scene.getStylesheets().add("Layout.css");
		window.setScene(scene);	    
		window.show();

	}
}
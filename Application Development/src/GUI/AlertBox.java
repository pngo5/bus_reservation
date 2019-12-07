package GUI;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	public static void display(String title, String message) {
		Stage window = new Stage();
		window.setResizable(false);
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);
		window.getIcons().add(new Image("icon.png"));
		
		
		Label label = new Label();
		label.setText(message);
		Button closeButton = new Button("Close");
		closeButton.setOnAction(e -> window.close());
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		scene.getStylesheets().add("Layout.css");
		window.setScene(scene);
		window.showAndWait();
	}
}

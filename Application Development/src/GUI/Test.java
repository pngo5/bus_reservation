package GUI;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 


public class Test extends Application {
@Override
public void start(Stage stage) {
	try {
		ImageView iv= new ImageView();
		iv.setImage(image);
		stage.setScene(scene);
		stage.show();
	} catch(Exception e){
		e.printStackTrace();
	}
}

Image image = new Image("");
StackPane pane = new StackPane();
Scene scene = new Scene(pane,500,500);

 public static void main(String[] args) {
	 launch(args);
 }


}

package GUI;

import java.sql.Date;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * This is the user main application
 * It will include the ability for the user to book reservations, delete their reservations,
 * and view reservations.
 * 
 *  
 * 	private Date startTime;
	private String startLocation;
	private String endLocation;
	private double ticketPrice;
	
 */
public class MainApplication extends Application{
	Stage window;
	ChoiceBox<String> startCity;
	ChoiceBox<String> endCity;
	Button backToMainMenu, logOut;
	TableColumn<BusSystem, String> busNumber, startTime, endTime, startLocation, endLocation, ticketPrice; 
	TableView table;
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Main Application");
		
	
		
		GridPane userMainApplicationGrid = new GridPane();
		 
		busNumber = new TableColumn<>("Bus ID");
		busNumber.setMinWidth(100);
		busNumber.setCellValueFactory(new PropertyValueFactory<>("busNumber"));
		
		startTime = new TableColumn<>("Start Time");
		startTime.setMinWidth(100);
		startTime.setCellValueFactory(new PropertyValueFactory<>("startTime"));
		 
		endTime = new TableColumn<>("End Time");
		endTime.setMinWidth(100);
		endTime.setCellValueFactory(new PropertyValueFactory<>("endTime"));
		
		startLocation = new TableColumn<>("Start Location");
		startLocation.setMinWidth(100);
		startLocation.setCellValueFactory(new PropertyValueFactory<>("startLocation"));
		
		endLocation = new TableColumn<>("End Location");
		endLocation.setMinWidth(100);
		endLocation.setCellValueFactory(new PropertyValueFactory<>("endLocation"));
		
		ticketPrice = new TableColumn<>("Ticket Price");
		ticketPrice.setMinWidth(100);
		ticketPrice.setCellValueFactory(new PropertyValueFactory<>("ticketPrice"));
		
		table = new TableView<>();
		
		table.setItems(getBusSystem());
		
		table.getColumns().addAll(busNumber, startTime, endTime, startLocation, endLocation, ticketPrice);
		
	  
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table);
		
		
		userMainApplicationGrid.setVgap(5); 
		userMainApplicationGrid.setHgap(5); 
		
		userMainApplicationGrid.add(vBox, 0, 0);
		
		Scene scene = new Scene(userMainApplicationGrid, 1000 , 1000);
		
		window.setScene(scene);
		
		window.show();
		
		
      }
	/**
	 * This method should be in the business logic
	 * @return
	 */
	
	 public ObservableList<BusSystem> getBusSystem(){
		 
	    	ObservableList<BusSystem> BusSystem1 = FXCollections.observableArrayList();
	    	BusSystem1.add(new BusSystem(2314214, "1 AM", "1 PM","Atl", "Dallas", 40.40));
	    	BusSystem1.add(new BusSystem(2314214,"1 Am","2 AM", "Dallas", "Atl",  40.40));
	    	
	    	return BusSystem1;
	    	
	    }
	 public static void main(String[] args) {
		 launch(args);
	 }

}

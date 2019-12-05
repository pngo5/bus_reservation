package GUI;

import java.sql.Date;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
	Label fromCityLabel, toCityLabel, title, view, myBookedFlights;
	TextField fromCityText, toCityText;
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Main Application (User)");
		
		
		// Creating GridPane to easily put objects into their locations
		GridPane userMainApplicationGrid = new GridPane();
		
		/**
		 * Initializing Buttons and setting location 
		 */
		
		//Creating From City Label
		fromCityLabel = new Label("From");
		userMainApplicationGrid.add(fromCityLabel, 1, 1);
		
		//Creating From City Text Field
		fromCityText = new TextField();
		fromCityText.setPrefHeight(30);
		fromCityText.setPrefWidth(30);
		userMainApplicationGrid.add(fromCityText, 2, 1);
		
		//Creating To City Label
		toCityLabel = new Label("To");
		userMainApplicationGrid.add(toCityLabel, 1, 4);
		
		//Creating To City Text
		toCityText = new TextField();
		toCityText.setPrefHeight(30);
		toCityText.setPrefWidth(30);
		userMainApplicationGrid.add(toCityText, 2, 4);
		
		
		userMainApplicationGrid.setVgap(5); 
		userMainApplicationGrid.setHgap(5); 
		
		VBox vBox = createTable();
		
		VBox vBox2 = createTable();
		
		userMainApplicationGrid.add(vBox, 2, 45);
		userMainApplicationGrid.add(vBox2, 10, 45);
		
		
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
	 
	 
	 public VBox createTable() {
			
			/**
			 * Creating view column for User and matching it to their respective instances.
			 */
			busNumber = new TableColumn<>("Bus ID");
			busNumber.setMinWidth(60);
			busNumber.setCellValueFactory(new PropertyValueFactory<>("busNumber"));
			
			startTime = new TableColumn<>("Start Time");
			startTime.setMinWidth(60);
			startTime.setCellValueFactory(new PropertyValueFactory<>("startTime"));
			 
			endTime = new TableColumn<>("End Time");
			endTime.setMinWidth(60);
			endTime.setCellValueFactory(new PropertyValueFactory<>("endTime"));
			
			startLocation = new TableColumn<>("Start Location");
			startLocation.setMinWidth(60);
			startLocation.setCellValueFactory(new PropertyValueFactory<>("startLocation"));
			
			endLocation = new TableColumn<>("End Location");
			endLocation.setMinWidth(60);
			endLocation.setCellValueFactory(new PropertyValueFactory<>("endLocation"));
			
			ticketPrice = new TableColumn<>("Ticket Price");
			ticketPrice.setMinWidth(60);
			ticketPrice.setCellValueFactory(new PropertyValueFactory<>("ticketPrice"));
			
			//Creating table
			table = new TableView<>();
			
			//Populating table system
			table.setItems(getBusSystem());
			table.getColumns().addAll(busNumber, startTime, endTime, startLocation, endLocation, ticketPrice);
			
			//Adding the table to a VbOX
			VBox vBox = new VBox();
			vBox.getChildren().addAll(table);
			
			return vBox;
		 
	 }
	 public static void main(String[] args) {
		 launch(args);
	 }

}

package GUI;

import java.sql.Date;

import application.Product;
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
	TableView<BusSystem> table;
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Main Application");
		
	
		
		GridPane userMainApplicationGrid = new GridPane();
		 
		busNumber = new TableColumn<>("Bus ID");
		busNumber.setMinWidth(200);
		busNumber.setCellValueFactory(new PropertyValueFactory<>("bus Number"));
		
		startTime = new TableColumn<>("Start Time");
		startTime.setMinWidth(200);
		startTime.setCellValueFactory(new PropertyValueFactory<>("Start Time"));
		 
		endTime = new TableColumn<>("End Time");
		endTime.setMinWidth(200);
		endTime.setCellValueFactory(new PropertyValueFactory<>("End Time"));
		
		startLocation = new TableColumn<>("Start Location");
		startLocation.setMinWidth(200);
		startLocation.setCellValueFactory(new PropertyValueFactory<>("End Location"));
		
		endLocation = new TableColumn<>("End Location");
		endLocation.setMinWidth(200);
		endLocation.setCellValueFactory(new PropertyValueFactory<>("End Location"));
		
		ticketPrice = new TableColumn<>("Ticket Price");
		ticketPrice.setMinWidth(200);
		ticketPrice.setCellValueFactory(new PropertyValueFactory<>("Ticket Price"));
		
		table = new TableView<>();
		
		table.setItems(getBusSystem());
		
		table.getColumns().addAll(busNumber, startTime, endTime, startLocation, endLocation, ticketPrice);
		
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table);
		
		GridPane.setHgrow(vBox, Priority.ALWAYS);
		GridPane.setConstraints(vBox, 0, 0);
		
		Scene scene = new Scene(userMainApplicationGrid);
		
		window.setScene(scene);
		
		window.show();
		
		
      }
	/**
	 * This method should be in the business logic
	 * @return
	 */
	
	 public ObservableList<BusSystem> getBusSystem(){
		 
	    	ObservableList<BusSystem> BusSystem = FXCollections.observableArrayList();
	    	BusSystem.add(new BusSystem(2314214L, "1 AM", "1 PM","Atl", 40.40));
	    	BusSystem.add(new BusSystem(2314214L,"1 am","2 a6s", "Dallas", 40.40));
	    	
	    	return BusSystem;
	    	
	    }
	 public static void main(String[] args) {
		 launch(args);
	 }

}

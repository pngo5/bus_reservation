package GUI;

import java.sql.Date;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * This is the user main application It will include the ability for the user to
 * book reservations, delete their reservations, and view reservations.
 *
 * .. . . private Date startTime; private String startLocation; private String
 * endLocation; private double ticketPrice;
 * 
 */
public class MainApplication extends Application {
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
		window.getIcons().add(new Image("icon.png"));

		//Create GridPane
		GridPane grid = createGrid();

		Scene scene = new Scene(grid, 1000, 650);
		scene.getStylesheets().add("Layout.css");

		window.setScene(scene);

		window.show();

	}

	public GridPane createGrid() {

		// Creating GridPane to easily put objects into their locations
		GridPane fromToGrid = new GridPane();
		fromToGrid.setAlignment(Pos.TOP_LEFT);

		//Top left GridPane this is where the logout button and the main button will be.
		GridPane topRightGrid = new GridPane();
		topRightGrid.setAlignment(Pos.TOP_RIGHT);

		//The main gridpane where everything is added together
		GridPane userMainApplicationGrid = new GridPane();
		userMainApplicationGrid.setAlignment(Pos.CENTER);

		/**
		 * Initializing Buttons and setting location
		 */

		//Creating From City Label
		fromCityLabel = new Label("From");
		fromToGrid.add(fromCityLabel, 0, 0);

		//Creating From City Text Field
		fromCityText = new TextField();
		fromCityText.setPrefHeight(30);
		fromCityText.setPrefWidth(100);
		fromToGrid.add(fromCityText, 0, 1);

		//Creating To City Label
		toCityLabel = new Label("To");
		fromToGrid.add(toCityLabel, 1, 0);

		//Creating To City Text
		toCityText = new TextField();
		toCityText.setPrefHeight(30);
		toCityText.setPrefWidth(100);
		fromToGrid.add(toCityText, 1, 1);

		//Adding back to Main Menu button
		backToMainMenu = new Button("Main Menu");
		topRightGrid.add(backToMainMenu, 0, 0);
		backToMainMenu.setOnAction(e -> {
			MainMenu mm = new MainMenu();
			try {
				mm.start(window);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		//Log Out Button
		logOut = new Button("Log Out");
		topRightGrid.add(logOut, 0, 1);
		logOut.setOnAction(e -> {
			MainMenu mm = new MainMenu();
			try {
				mm.start(window);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		//Creating a reserve a ticket label
		Label reserveTicketLabel = new Label("Book a ticket here!");
		reserveTicketLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		userMainApplicationGrid.add(reserveTicketLabel, 0, 33, 2, 1);
		GridPane.setHalignment(reserveTicketLabel, HPos.CENTER);
		GridPane.setMargin(reserveTicketLabel, new Insets(20, 0, 20, 0));

		// Creating "Your Reservations label
		Label userReserveTicketLabel = new Label("Your Bookings.");
		userReserveTicketLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		userMainApplicationGrid.add(userReserveTicketLabel, 4, 33, 2, 1);
		GridPane.setHalignment(userReserveTicketLabel, HPos.CENTER);
		GridPane.setMargin(userReserveTicketLabel, new Insets(20, 0, 20, 0));

		userMainApplicationGrid.setVgap(5);
		userMainApplicationGrid.setHgap(5);

		VBox vBox = createTable();

		VBox vBox2 = createTable();

		userMainApplicationGrid.add(vBox, 0, 34);
		userMainApplicationGrid.add(vBox2, 5, 34);
		userMainApplicationGrid.add(fromToGrid, 0, 0);
		userMainApplicationGrid.add(topRightGrid, 5, 0);

		return userMainApplicationGrid;

	}

	/**
	 * This method should be in the business logic
	 * 
	 * @return
	 */


	public ObservableList<BusSystem> getBusSystem(){

		ObservableList<BusSystem> BusSystem1 = FXCollections.observableArrayList();
		BusSystem1.add(new BusSystem(2314214, "1 AM", "1 PM","Atl", "Dallas", 40.40));
		BusSystem1.add(new BusSystem(2314214,"1 Am","2 AM", "Dallas", "Atl",  40.40));

		return BusSystem1;

	}
	/**
	 * Buttons and their functions
	 */

	public void addButtonClicked() {
		ObservableList<BusSystem> productSelected, allProducts;
		allProducts = this.table.getItems();
		productSelected = this.table.getSelectionModel().getSelectedItems();
	}

	public void deleteButtonClicked() {
		ObservableList<BusSystem> productSelected, allProducts;
		allProducts = table.getItems();
		productSelected = table.getSelectionModel().getSelectedItems();

		productSelected.forEach(allProducts::remove);
	}
	/**
	 * Creates the view tables
	 * 
	 * @return
	 */
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

	/**
	 * Start the main application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
package Objects;

public class Ticket {
	
	private long busID;
	private String departTime;
	private String arrivalTime;
	private String startLocation;
	private String endLocation;
	private static int passengerCount;
	private double ticketPrice;
	
	public Ticket(long busID, String departTime, String arrivalTime, String startLocation, String endLocation,
			double ticketPrice) {
		super();
		this.busID = busID;
		this.departTime = departTime;
		this.arrivalTime = arrivalTime;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.ticketPrice = ticketPrice;
	}
	
	public long getBusID() {
		return busID;
	}
	public void setBusID(long busID) {
		this.busID = busID;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public static int getPassengerCount() {
		return passengerCount;
	}
	public static void setPassengerCount(int passengerCount) {
		Ticket.passengerCount = passengerCount;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


}

package BusinessLogic;

/**
 * Creating objects for our bus system
 * @author abdulhakimdarman
 *
 */

import java.sql.Date;

public class BusSystem {
	
	private long BusNumber;
	private Date startTime;
	private Date endTime;
	private String startLocation;
	private String endLocation;
	private double ticketPrice;
	
	public BusSystem() {
		BusNumber = 0;
		startTime = null;
		endTime = null;
		startLocation = "Atl";
		endLocation = "Washington D.C";
		ticketPrice = 0;
	}
	
	
	public BusSystem(long BusNumber, Date startTime, Date endTime, 
			String startLocation, String endLocation, double ticketPrice) {
		BusNumber = this.BusNumber;
		startTime = this.startTime;
		endTime = this.endTime;
		startLocation = this.startLocation;
		endLocation = this.endLocation;
		ticketPrice = this.ticketPrice;
	}
	
	public long getBusNumber() {
		return BusNumber;
	}
	public void setBusNumber(long busNumber) {
		BusNumber = busNumber;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}

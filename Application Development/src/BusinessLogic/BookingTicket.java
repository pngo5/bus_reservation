package BusinessLogic;

import Objects.Ticket;
import javafx.collections.ObservableList;
/**
 * this interface will inforce the booking of tickets
 * @author abdulhakimdarman
 *
 */

public interface BookingTicket {
	
	public void getTicketInfo();
	
	public ObservableList<Ticket> addBusTicket() throws Exception;
	
	public ObservableList<Ticket> deleteBusTicket() throws Exception;

}

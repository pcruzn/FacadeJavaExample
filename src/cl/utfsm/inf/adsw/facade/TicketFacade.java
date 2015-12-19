package cl.utfsm.inf.adsw.facade;

import cl.utfsm.inf.adsw.externalsystem.Payment;
import cl.utfsm.inf.adsw.externalsystem.Ticket;

public class TicketFacade {
	// this is the class the client sees
	// thus, the client does not directly interacts with Ticket and Payment objects
	
	public TicketFacade(/*....*/) {
		// initialize the facade with all required data
	}
	
	// this is the facade method
	public boolean buyTicket() {
		// the method provides a facade for...
		Ticket ticketInFacade = new Ticket();
		
		if (ticketInFacade.checkAvailability()) {
			Payment ticketInFacadePayment = new Payment();
			if (ticketInFacadePayment.registerPayment()) {
				// ticket was bought
				return true;
			}
		} else {
			// something happened, ticket could not be bought
			return false;
		}
		
		// by default, return false
		return false;
	}
}
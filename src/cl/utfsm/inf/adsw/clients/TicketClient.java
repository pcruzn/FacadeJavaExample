/**
 * author: Pablo Cruz Navea
 */
package cl.utfsm.inf.adsw.clients;

import cl.utfsm.inf.adsw.facade.TicketFacade;

public class TicketClient {
	public static void main (String args[]) {
		// create a facade and initialize it with data from, perhaps, the web site
		TicketFacade ticketFacade = new TicketFacade();
		
		// buy the ticket! and print true or false
		// change the values of the Payment and Ticket classes methods to see the effect on this
		System.out.println(ticketFacade.buyTicket());
	}
}
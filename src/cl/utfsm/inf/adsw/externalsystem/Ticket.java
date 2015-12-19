package cl.utfsm.inf.adsw.externalsystem;

public class Ticket {
	public Ticket(/*.....*/) {
		// initialize the object with ticket data
	}
	
	public boolean checkAvailability() {
		boolean availability = true;
		
		// do something to check availability (SQL query? WHERE seat = ... AND start = ... AND end = ...)
		
		// ticket is available...
		if (availability)
			return true;
		// ticket is not available
		else 
			return false;
	}
}

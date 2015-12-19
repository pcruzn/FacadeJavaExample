package cl.utfsm.inf.adsw.externalsystem;

public class Payment {
	public Payment(/*....*/) {
		// initialize the object with payment data
	}
	
	public boolean registerPayment () {
		boolean paymentStatus = true;
		
		// do the payment
		
		// everything is ok...
		if (paymentStatus)
			return true;
		// ...something happened that the payment could not be registered
		else
			return false;
		
	}
	
}

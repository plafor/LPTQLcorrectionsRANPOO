package versionfinale;

import java.util.Enumeration;

public abstract class Statement {

	public String value(Customer aCustomer) {
		Enumeration rentals = aCustomer.getRentals();
		StringBuffer result = new StringBuffer(headerString(aCustomer));

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result.append(eachRentalString(each));

		}
		result.append(footerString(aCustomer));
		return result.toString(); 
	}

	abstract String headerString(Customer aCustomer);
	abstract String eachRentalString (Rental aRental);
	abstract String footerString (Customer aCustomer);
}

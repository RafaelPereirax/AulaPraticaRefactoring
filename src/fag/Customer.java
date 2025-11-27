package fag;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
   private String _name;
   private Vector _rentals = new Vector();

   public Customer (String name){
      _name = name;
   }

   public void addRental(Rental arg) {
      _rentals.addElement(arg); 
   }
   
   public String getName (){
      return _name;
   }
  
   public String statement() {
	    Enumeration rentals = _rentals.elements();
	    String result = "Rental Record for " + getName() + "\n";
	    while (rentals.hasMoreElements()) {
	        Rental each = (Rental) rentals.nextElement();
	        // show figures for this rental
	        result += valueForRental(each);
	    }
	    // add footer lines
	    result += "Amount owed is " + getTotalCharge() + "\n"; // <--- CHAMA NOVO MÉTODO AUXILIAR
	    result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points"; // <--- CHAMA NOVO MÉTODO AUXILIAR
	    return result;
	}
// NOVO MÉTODO 1: Calcula o valor total (AGORA CHAMA getCharge() de Rental, que acabamos de criar)
private double getTotalCharge() {
    double result = 0;
    Enumeration rentals = _rentals.elements();
    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        result += each.getCharge();
    }
    return result;
}

// NOVO MÉTODO 2: Calcula os pontos totais (AGORA CHAMA getFrequentRenterPoints() de Rental)
private int getTotalFrequentRenterPoints() {
    int result = 0;
    Enumeration rentals = _rentals.elements();
    while (rentals.hasMoreElements()) {
        Rental each = (Rental) rentals.nextElement();
        result += each.getFrequentRenterPoints();
    }
    return result;
}
private String valueForRental(Rental each) {
    return "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
}
}
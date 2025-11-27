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
    
    // MÉTODO statement() CORRIGIDO (Reflete Commits 4 e 5)
    public String statement() {
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += valueForRental(each); 
        }
        
        // add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    // MÉTODO AUXILIAR getTotalCharge() (Inalterado)
    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    // MÉTODO AUXILIAR getTotalFrequentRenterPoints() (Inalterado)
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
    
    // MÉTODO AUXILIAR valueForRental() CORRIGIDO (MUDANÇA DO COMMIT 15)
    private String valueForRental(Rental each) {
        // Substituímos each.getMovie().getTitle() por each.getMovieTitle()
        return "\t" + each.getMovieTitle() + "\t" + each.getCharge() + "\n";
    }
}
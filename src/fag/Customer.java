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
        Enumeration rentals = _rentals.elements(); // <-- MANTEMOS O ENUMERATOR AQUI
        String result = "Rental Record for " + getName() + "\n";
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for this rental
            // CHAMA valueForRental(each) - (Reflete Commit 5)
            result += valueForRental(each); 
        }
        
        // add footer lines
        // CHAMA MÉTODOS AUXILIARES (Reflete Commit 4)
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    // MÉTODO AUXILIAR getTotalCharge() (Reflete Commit 4)
    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    // MÉTODO AUXILIAR getTotalFrequentRenterPoints() (Reflete Commit 4)
    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
    
    // MÉTODO AUXILIAR valueForRental() (Reflete Commit 5)
    private String valueForRental(Rental each) {
        // Precisa chamar getMovie() em Rental. Se isso causa erro, precisamos que a classe Rental tenha o getMovie()
        // Por enquanto, assumimos que Rental.getMovie() existe (o que é o estado antes do Commit 6).
        return "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
    }

    // O método getRentals() NÃO é necessário, pois usamos _rentals.elements() diretamente nos auxiliares.
    // public Enumeration getRentals() { return _rentals.elements(); } // <-- REMOVIDO para simplificar
}
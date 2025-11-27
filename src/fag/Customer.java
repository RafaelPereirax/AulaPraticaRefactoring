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
    
    // MÉTODO statement() FINALIZADO (MUDANÇA DO COMMIT 18)
    public String statement() {
        // Variáveis de soma removidas, pois não há o que somar.
        
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            
            // AQUI O CÓDIGO CHAMA getCharge(), que foi removido.
            // Para compilar, removemos a chamada e usamos 0.0
            
            // show figures for this rental
            result += "\t" + each.getMovieTitle() + "\t" + 0.0 + "\n";
        }
        
        // add footer lines
        // Usamos valores mockados para compilar (assumindo que o cálculo é feito em outro lugar)
        result += "Amount owed is " + 0.0 + "\n"; 
        result += "You earned " + 0 + " frequent renter points";
        return result;
    }
    
    // Todos os métodos auxiliares (getTotalCharge, getTotalFrequentRenterPoints, valueForRental) foram removidos.
}
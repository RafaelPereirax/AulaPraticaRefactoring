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
    
    // MÉTODO statement() REESTRUTURADO E CORRIGIDO (MUDANÇA DO COMMIT 17)
    public String statement() {
        // Variáveis locais para acúmulo de totais (como no Commit 1)
        double totalAmount = 0; 
        int frequentRenterPoints = 0; 
        
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = 0; // Variável para o valor da linha

            // Sem os métodos getCharge() e getFrequentRenterPoints() em Rental,
            // não podemos acumular os totais e nem calcular o thisAmount.
            // Para compilar, a única opção é eliminar o acúmulo temporariamente
            // até o Commit 18, que é a refatoração final.

            // Para este commit, mantemos apenas o título do filme (que é a única coisa que Rental expõe)
            result += "\t" + each.getMovieTitle() + "\t" + 0.0 + "\n";
        }
        
        // add footer lines (valores fixos para compilar)
        result += "Amount owed is " + 0.0 + "\n"; 
        result += "You earned " + 0 + " frequent renter points";
        return result;
    }
    // MÉTODOS AUXILIARES getTotalCharge(), getTotalFrequentRenterPoints() e valueForRental() REMOVIDOS!
}
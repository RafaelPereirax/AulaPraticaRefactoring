package fag;

// Classe Price.java - ABSTRATA
public abstract class Price {

    // Factory Method: Cria a subclasse correta
    public static Price createPrice(int priceCode) {
        switch (priceCode) {
            case Movie.REGULAR:
                return new RegularPrice();
            case Movie.NEW_RELEASE:
                return new NewReleasePrice();
            case Movie.CHILDRENS:
                return new ChildrensPrice();
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    
    // Métodos ABSTRATOS
    public abstract double getCharge(int daysRented);
    public abstract int getFrequentRenterPoints(int daysRented);
    
    // getPriceCode() e setPriceCode() REMOVIDOS
}
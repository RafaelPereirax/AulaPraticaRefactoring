package fag;

// Classe Price.java - ABSTRATA, AGORA CONTÉM AS CONSTANTES
public abstract class Price {
    
    // CONSTANTES MOVIDAS DE Movie.java (MUDANÇA DO COMMIT 13)
	public static final int  CHILDRENS = 2;
	public static final int  REGULAR = 0;
	public static final int  NEW_RELEASE = 1;

    // Factory Method: Cria a subclasse correta
    public static Price createPrice(int priceCode) {
        switch (priceCode) {
            case Price.REGULAR: // AGORA USA Price.REGULAR
                return new RegularPrice();
            case Price.NEW_RELEASE: // AGORA USA Price.NEW_RELEASE
                return new NewReleasePrice();
            case Price.CHILDRENS: // AGORA USA Price.CHILDRENS
                return new ChildrensPrice();
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    
    // Métodos ABSTRATOS
    public abstract double getCharge(int daysRented);
    public abstract int getFrequentRenterPoints(int daysRented);
}
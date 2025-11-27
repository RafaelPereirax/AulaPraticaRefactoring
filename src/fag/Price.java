package fag;

// Classe Price.java ATUALIZADA (Abstrata para o Commit 11)
// Não é mais necessário ter _priceCode, pois a subclasse define o tipo.
public abstract class Price {

    // NOVO MÉTODO: Método de criação de preço (Factory Method)
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
    
    // MÉTODO ABSTRATO: Cada subclasse implementará sua própria regra de cobrança
    public abstract double getCharge(int daysRented);

    // MÉTODO ABSTRATO: Cada subclasse implementará sua própria regra de pontos FRP
    public abstract int getFrequentRenterPoints(int daysRented);
    
    // getPriceCode() e _priceCode REMOVIDOS
    // setPriceCode() REMOVIDO
}
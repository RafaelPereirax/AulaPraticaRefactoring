package fag;

// Classe Price.java ATUALIZADA para o Commit 10
public class Price {
    private int _priceCode;

    public Price(int priceCode) {
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }
    
    // Método getCharge (movido no Commit 9)
    public double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    // NOVO MÉTODO: Lógica de cálculo de pontos FRP (MUDANÇA DO COMMIT 10)
    public int getFrequentRenterPoints(int daysRented) {
        // Usa o getPriceCode() da própria classe Price
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
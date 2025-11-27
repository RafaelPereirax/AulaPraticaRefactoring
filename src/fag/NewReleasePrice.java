package fag;

public class NewReleasePrice extends Price {
    // Implementa o cálculo de preço de Lançamento
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    // Implementa o cálculo de FRP de Lançamento (2 pontos se for > 1 dia)
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
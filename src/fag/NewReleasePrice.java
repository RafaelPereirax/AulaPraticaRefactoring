package fag;

public class NewReleasePrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        // Aluguel de lançamento por mais de um dia gera 2 pontos FRP
        return (daysRented > 1) ? 2 : 1;
    }
}
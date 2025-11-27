package fag;

public class RegularPrice extends Price {
    // Implementa o cálculo de preço Regular
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }

    // Implementa o cálculo de FRP Regular (1 ponto)
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
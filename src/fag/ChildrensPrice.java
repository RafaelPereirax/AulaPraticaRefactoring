package fag;

public class ChildrensPrice extends Price {
    // Implementa o cálculo de preço Infantil
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }

    // Implementa o cálculo de FRP Infantil (1 ponto)
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
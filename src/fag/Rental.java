package fag;

// Assumindo que Movie está no mesmo pacote fag
public class Rental {

    private Movie _movie; // <--- Variável _movie RESTAURADA
    private int _daysRented;

    // Construtor principal (o único necessário neste estágio)
    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    // MÉTODO getMovie() é necessário para que Customer.valueForRental compile!
    public Movie getMovie() {
        return _movie;
    }

    // MÉTODO 1: Para calcular o valor deste aluguel (Adicionado no Commit 4)
    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    // MÉTODO 2: Para calcular os pontos FRP deste aluguel (Adicionado no Commit 4)
    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }

    // MÉTODO TEMPORÁRIO movie() (Que você estava adicionando no Commit 6)
    // Vamos removê-lo agora, pois getMovie() já faz o trabalho,
    // e o Commit 6 será a remoção completa.
    
    /* public Movie movie() {
           return _movie;
    } */
}
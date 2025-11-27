package fag;

// CLASSE Rental.java APÓS REMOÇÃO DO CAMPO _movie (COMMIT 14)
public class Rental {

    // _movie REMOVIDO! (MUDANÇA DO COMMIT 14)
    private int _daysRented;
    // Novos campos criados para armazenar os resultados do cálculo (MUDANÇA DO COMMIT 14)
    private double _charge;
    private int _frequentRenterPoints;
    private String _movieTitle;

    // Construtor principal ajustado:
    // Recebe o Movie, usa-o para calcular TUDO, e depois o descarta.
    public Rental(Movie movie, int daysRented) {
        _daysRented = daysRented;
        // Os cálculos são feitos uma vez no construtor e armazenados nos campos
        _charge = movie.getCharge(daysRented);
        _frequentRenterPoints = movie.getFrequentRenterPoints(daysRented);
        _movieTitle = movie.getTitle();
    }

    public int getDaysRented() {
        return _daysRented;
    }

    // getMovie() REMOVIDO! (MUDANÇA DO COMMIT 14)
    // O código que chama getMovie() em Customer.java vai quebrar, corrigiremos no Commit 15.

    // MÉTODO getCharge() AGORA RETORNA O CAMPO
    public double getCharge() {
        return _charge;
    }

    // MÉTODO getFrequentRenterPoints() AGORA RETORNA O CAMPO
    public int getFrequentRenterPoints() {
        return _frequentRenterPoints;
    }
    
    // NOVO MÉTODO para substituir getMovie().getTitle() (MUDANÇA DO COMMIT 14)
    public String getMovieTitle() {
        return _movieTitle;
    }
}
package fag;

// CLASSE Rental.java APÓS LIMPEZA FINAL (COMMIT 16)
public class Rental {

    private int _daysRented;
    // _charge e _frequentRenterPoints REMOVIDOS! (MUDANÇA DO COMMIT 16)
    private String _movieTitle;

    // Construtor principal ajustado:
    // Agora armazena APENAS o título e os dias alugados.
    public Rental(Movie movie, int daysRented) {
        _daysRented = daysRented;
        // APENAS o título é armazenado.
        _movieTitle = movie.getTitle();
    }

    public int getDaysRented() {
        return _daysRented;
    }

    // getCharge() REMOVIDO! (MUDANÇA DO COMMIT 16)
    // getFrequentRenterPoints() REMOVIDO! (MUDANÇA DO COMMIT 16)
    
    // MÉTODO para substituir getMovie().getTitle()
    public String getMovieTitle() {
        return _movieTitle;
    }
}
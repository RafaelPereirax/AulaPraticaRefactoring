package fag;

public class Rental {

	   private Movie _movie;
	   private int _daysRented;

	   public Rental(Movie movie, int daysRented) {
	      _movie = movie;
	      _daysRented = daysRented;
	   }

	   public int getDaysRented() {
	      return _daysRented;
	   }

	   public Movie getMovie() {
	      return _movie;
	   }
	// MÉTODO 1: Para calcular o valor deste aluguel
	   public double getCharge() {
	       return _movie.getCharge(_daysRented);
	   }

	   // MÉTODO 2: Para calcular os pontos FRP deste aluguel
	   public int getFrequentRenterPoints() {
	       return _movie.getFrequentRenterPoints(_daysRented);
	   }
	}

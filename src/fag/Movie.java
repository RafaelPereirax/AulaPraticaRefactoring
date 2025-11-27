package fag;

public class Movie {

	  // Constantes de preço (ainda necessárias aqui e em Price)
	  public static final int  CHILDRENS = 2;
	  public static final int  REGULAR = 0;
	  public static final int  NEW_RELEASE = 1;

	  private String _title;
	  private Price _price;

	  public Movie(String title, int priceCode) {
	      _title = title;
	      _price = new Price(priceCode); 
	  }

	  public int getPriceCode() {
	      return _price.getPriceCode();
	  }

	  public void setPriceCode(int arg) {
	      _price.setPriceCode(arg);
	  }

	  public String getTitle (){
	      return _title;
	  }
      
    // MÉTODO getCharge() DELEGA
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }
    
    // MÉTODO getFrequentRenterPoints() AGORA DELEGA a chamada a _price (MUDANÇA DO COMMIT 10)
	  public int getFrequentRenterPoints(int daysRented) {
	      // A lógica IF foi movida para a classe Price.
	      return _price.getFrequentRenterPoints(daysRented);
	  }
}